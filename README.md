# Max-Gnoise
A signal rate Gaussian noise generator for MaxMSP
<h2>Use: </h2>

To use the object you need to do the following.

Place <i><b>Gnoise.class</b></i> and <i><b>Gnoise.java</b></i> in the classes folder:
Cycling '74 > java > classes

Then just create a new <i><b>mxj~ Gnoise</b></i> object. 
<ul>
<li>Inlet 1 allows you to change the mean value of Gnoise</li>
<li>Inlet 2 allows you to change the standard deviation of Gnoise</li>

<li>Outlet 1 outputs the Gaussian noise</li>
</ul>
<h2>Attributes: </h2>

You can change the initial the values with @mean, @stddev, and @seed

<i>The defalut values are: mean 0.0f, stddev 1.0f, seed Long.MAX_VALUE or 9,223,372,036,854,755,807</i>

If you're curious about the code you can send a viewsource message to <i><b>mxj~ Gnoise</b></i>.

<h2>Troubleshooting: </h2>

randomRange has been tested with Max5 and Max6 on OS X Yosemite with no issues.  If you test on a different system or come across a bug please let me know so I can update the docs. 

If you have any issues the mxj~ reference is a good place to look: https://docs.cycling74.com/max5/refpages/max-ref/mxj~.html or you can drop me a line ed.mc.farr@gmail.com

<h4>todo: </h4>
impliment box-muller transform and linear interpolation (similar to rand~)
