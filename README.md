rfx-s2-http-server
====================

Reactive Small and Scalable HTTP Server for real-time reactive processing and log tracking

Powered By
* Log tracking Server at FPT Online, VnExpress.net (http://l.a.eclick.vn)
* Log tracking Server at FPT Online, Advertising Network Eclick.vn (http://c.d.eclick.vn, http://t.d.eclick.vn)
* The Platform for saving interested text to user's dropbox (http://nguyentantrieu.info/blog/save2mycloud-store-your-useful-information-in-dropbox)
    

RUN:

    You need java 1.8 or later installed and 
    added to the path and JAVA_HOME set to run 
    the server.

    >run.sh OR
    >run.bat OR
    >/usr/lib/jvm/jdk1.8.0/bin/java -jar -Xms256M -Xmx1048M  -server  -XX:+UseCompressedOops -X+UseParNewGC -XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled -XX:+CMSScavengeBeforeRemark -XX:+DisableExplicitGC -Djava.awt.headless=true http-server.jar
    
    ##IMPORTANT##


BUILD AND TEST OR DOCUMENT:

    You need ant 1.8.0 installed and added 
    to the path and ANT_HOME set to build the 
    server.

    >ant OR
    >ant doc

VERSION:

    0.1 - Alpha

        
Have fun! Trieu
This project is implemented by https://twitter.com/tantrieuf31 at http://mc2ads.com
