$wnd.GwtBootstrap3Demo.runAsyncCallback40("function MRc(){}\nfunction NRc(){NRc=Qgb;KRc=new MRc}\nfunction JRc(){this.a=(NRc(),KRc);LRc(this.a)}\nfunction Fxc(a){txb.call(this,a);Dxc(this)}\nfunction CRc(a,b,c){AHb();YHb.call(this,a,b,c,($xc(),Zxc))}\nfunction uWc(a){var b;if(!a.M){b=new IRc;a.M=b}return a.M}\nfunction tWc(a){var b,c;if(!a.L){c=new CRc(aHb(CIb(a.a)),(b=uWc(a),b),sWc(a));sHb((FIb(a.a),c),RIb(FIb(a.a)));a.L=c}return a.L}\nfunction LRc(a){if(!a.a){a.a=true;Ow();Qw(($C(),'.GBG2FFLDGM{background-color:#fcf2f2;border-color:#dfb5b4;}.GBG2FFLDHM{margin-top:0 !important;}.GBG2FFLDIM{margin-left:5px;}'));return true}return false}\nfunction IRc(){var a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,A,B,C,D,F,G;oIb.call(this);mIb(this,(new JRc,a=new s5b,m$b(a,(b=new V0b(YLd),m$b(b,(c=new i4b,c.a='Offline',h4b(c),c)),m$b(b,(d=new D_b,m$b(d,(e=new H1b((fec(),cec)),$jb((zrb(),e.eb),'GBG2FFLDHM',true),Vxc(e.b,gSd),n$b(e,e.b,0),e)),m$b(d,new Pxc((f=new nOb,f.a+='To use Offline, you must first add the extras module to your project. In Maven:',new Phb(f.a)).a)),m$b(d,(g=new f0c,g5b(g,(l=new nOb,l.a+=hSd,new Phb(l.a)).a),$jb(g.eb,bMd,true),g)),m$b(d,new Pxc((h=new nOb,h.a+=iSd,new Phb(h.a)).a)),m$b(d,(i=new f0c,g5b(i,(m=new nOb,m.a+='&lt;inherits name=\"org.gwtbootstrap3.extras.cachemanifest.Offline\"/&gt;',new Phb(m.a)).a),$jb(i.eb,bMd,true),i)),$jb(d.eb,'GBG2FFLDGM',true),d)),m$b(b,(j=new x4b,m$b(j,(n=new E4b,m$b(n,(o=new H1b(bec),Vxc(o.b,'What is Offline?'),n$b(o,o.b,0),o)),n)),m$b(j,(p=new z4b,m$b(p,new Fxc((q=new nOb,q.a+=\"<p>Web applications consist of web pages that need to be downloaded from a network and for this to happen there must be a network connection. However there are many instances when users cannot connect to a network due to reasons beyond their control. HTML5 provides the ability to access the web application even without a network connection using the<b>cache manifest<\\/b>. <br> <a href='http://en.wikipedia.org/wiki/Cache_manifest_in_HTML5'> http://en.wikipedia.org/wiki/Cache_manifest_in_HTML5 <\\/a> <\\/p> <p>The entire web application (css, javascript, resources etc) can be downloaded and stored locally so that offline support is possible - in addition this may improve perceived speed of your web application by making all resources instantly available from local storage. <\\/p> <p>Unfortunately, the GWT compiler automatically generates lots of css and javascript files that are different after every compile (the file names are crypto hashed) and so the <b>cache manifest<\\/b> needs to reflect this new set of files each time. <\\/p> <p>The Offline linker performs this task of generating a valid cache manifest every time you compile. <\\/p>\",new Phb(q.a)).a)),p)),m$b(j,new B4b),j)),m$b(b,(k=new x4b,m$b(k,(r=new E4b,m$b(r,(s=new H1b(bec),Vxc(s.b,'How to configure?'),n$b(s,s.b,0),s)),r)),m$b(k,(t=new z4b,m$b(t,new Pxc((u=new nOb,u.a+='Static resources that are needed (outside of the compile unit) require specific inclusion. These files would typically be index.html, css files or any resources not included within the GWT application. These files are included through the cachemanifest_static_files property added to your module.gwt.xml file.',new Phb(u.a)).a)),m$b(t,(v=new f0c,g5b(v,(w=new nOb,w.a+='&lt;extend-configuration-property name=\"cachemanifest_static_files\" value=\"index.html\" /&gt;\\\\n',new Phb(w.a)).a),$jb(v.eb,bMd,true),v)),m$b(t,new Pxc((A=new nOb,A.a+='To activate the linker, the following configuration is included in your GWT module definition (module.gwt.xml file) as follows:',new Phb(A.a)).a)),m$b(t,(B=new f0c,g5b(B,(C=new nOb,C.a+='&lt;inherits name=\"org.gwtbootstrap3.extras.cachemanifest.Offline\"/&gt;\\\\n &lt;add-linker name=\"offline\" /&gt;',new Phb(C.a)).a),$jb(B.eb,bMd,true),B)),m$b(t,new Pxc((D=new nOb,D.a+='Finally, include the cache manifest file within the html page that loads your GWT application, as follows:',new Phb(D.a)).a)),m$b(t,(F=new f0c,g5b(F,(G=new nOb,G.a+='&lt;!doctype html&gt;\\\\n &lt;html manifest=\"&lt;modulename&gt;/appcache.manifest\"&gt;\\\\n ....\\\\n &lt;/html&gt;\\\\n',new Phb(G.a)).a),$jb(F.eb,bMd,true),F)),t)),m$b(k,new B4b),k)),b)),a))}\nPgb(419,235,BId,Fxc);Pgb(1020,45,NId,CRc);var h5=NMb(PLd,'OfflinePresenter',1020);Pgb(1260,48,OId,IRc);var k5=NMb(PLd,'OfflineView',1260);Pgb(1525,1,{},JRc);var i5=NMb(PLd,'OfflineView_BinderImpl/Widgets',1525);var KRc;Pgb(1836,1,{},MRc);_.a=false;var j5=NMb(PLd,'OfflineView_BinderImpl_GenBundle_fr_InlineClientBundleGenerator/1',1836);Pgb(943,1,jLd);_.Xb=function VWc(){cKb(this.b,tWc(this.a.a))};iGd(op)(40);\n//# sourceURL=GwtBootstrap3Demo-40.js\n")