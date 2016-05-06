#This project is modified to be deployed to exo plf 4.3.0.

ATTN: in portlet.xml

     <init-param>
       <name>juzu.app_name</name>
       <value>org.exoplatform.example.video</value>
     </init-param>
     
The value should be the package name of the default controller class. If not it cannot be deployed.