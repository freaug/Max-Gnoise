import com.cycling74.max.*;
import com.cycling74.msp.*;
import java.util.Random;

public class Gnoise extends MSPPerformer
{
	//values
	float mean = 0.0f;
	float stddev = 1.0f;
	long seed = 0;
	Random r = new Random();
	//assist values
	private static final String[] INLET_ASSIST = new String[]{
		"Change the Mean value","Change the Standard Deviation"
	};
	private static final String[] INLET_ASSIST1 = new String[]{
		"Change the Standard Deviation"
	};
	private static final String[] OUTLET_ASSIST = new String[]{
		"output (sig)"
	};
	
	//constructor function
	public Gnoise(float gain)
	{
		declareInlets(new int[]{DataTypes.ALL, DataTypes.ALL});
		declareOutlets(new int[]{SIGNAL});
		createInfoOutlet(false);

		setInletAssist(INLET_ASSIST);
		setOutletAssist(OUTLET_ASSIST);

		declareAttribute("mean");
		declareAttribute("stddev");
		declareAttribute("seed", null, "setSeed");
	}
    //pick a spot in time...
	public void setSeed(int i)
	{
		seed = (long)i;
		r.setSeed(seed);
	}
	//method for chaning values
	public void inlet(float f){
		if(getInlet()==0){
			mean = f;
		}else if(getInlet()==1){
			stddev = f;
		}
	}
	//audio/data output
	public void perform(MSPSignal[] ins, MSPSignal[] outs)
	{
		
		int i;
		float[] out = outs[0].vec;
		for(i = 0; i < out.length;i++)
		{
			//gaussian distrubution around a mean value, change stddev for a wider range
			out[i] = (mean + stddev * (float)r.nextGaussian());	

		}
	}
}







