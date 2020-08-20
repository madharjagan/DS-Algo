<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1597549947972" ID="ID_1507427999" MODIFIED="1597571231811" TEXT="String">
<font NAME="Arial Black" SIZE="20"/>
<node CREATED="1597567084478" ID="ID_341265826" MODIFIED="1597567124063" POSITION="right" TEXT="intern">
<font NAME="Arial" SIZE="16"/>
<node CREATED="1597572891486" ID="ID_714730953" MODIFIED="1597572937355" TEXT="returns reference of the string in String Constant Pool"/>
<node CREATED="1597572944235" ID="ID_72949484" MODIFIED="1597573033824" TEXT="if not available, creates string in String Constant Pool"/>
</node>
<node CREATED="1597567140447" ID="ID_978204428" MODIFIED="1597655517225" POSITION="left" TEXT="Heap Vs String Constant Pool"/>
<node CREATED="1597567155782" ID="ID_965866808" MODIFIED="1597567173951" POSITION="right" TEXT="String Constant Pool">
<node CREATED="1597567600811" ID="ID_364015383" MODIFIED="1597567605938" TEXT="caching"/>
<node CREATED="1597567608317" ID="ID_1117156260" MODIFIED="1597567622873" TEXT="improves performance"/>
<node CREATED="1597567654114" ID="ID_1392026193" MODIFIED="1597567663627" TEXT="global state">
<node CREATED="1597567676835" ID="ID_499687201" MODIFIED="1597567686637" TEXT="this is why immutable"/>
</node>
<node CREATED="1597568766493" ID="ID_1007989870" MODIFIED="1597569488006" TEXT="Java 6">
<node CREATED="1597568652245" ID="ID_1117508812" MODIFIED="1597568687234" TEXT="SCP is Hashmap with 1009 buckets"/>
<node CREATED="1597568785741" ID="ID_1046431666" MODIFIED="1597568818158" TEXT="set -xx:StringTableSize=N"/>
<node CREATED="1597568840832" ID="ID_1687215354" MODIFIED="1597568886817" TEXT="located in permgem space"/>
</node>
<node CREATED="1597568825076" ID="ID_1727583165" MODIFIED="1597569475897" TEXT="Java 7">
<node CREATED="1597569494115" ID="ID_1403419007" MODIFIED="1597569538836" TEXT="SCP moved from permgem to heap"/>
</node>
<node CREATED="1597569546692" ID="ID_1477060110" MODIFIED="1597569892972" TEXT="Java 8">
<node CREATED="1597569896961" MODIFIED="1597569896961" TEXT="Hashmap Buckets size increased to 60013"/>
</node>
</node>
<node CREATED="1597567216050" ID="ID_1925055891" MODIFIED="1597655542307" POSITION="left" TEXT="intern vs deduplication"/>
<node CREATED="1597567256910" ID="ID_387945675" MODIFIED="1597567264865" POSITION="right" TEXT="final">
<node CREATED="1597568014502" ID="ID_517514872" MODIFIED="1597568040939" TEXT="no one overrides any behavior of String class"/>
</node>
<node CREATED="1597567270194" ID="ID_366097054" MODIFIED="1597567275169" POSITION="left" TEXT="immutable">
<node CREATED="1597568095085" ID="ID_386424230" MODIFIED="1597568131653" TEXT="makes String instance thread-safe"/>
</node>
<node CREATED="1597567396034" ID="ID_157572188" MODIFIED="1597567400250" POSITION="right" TEXT="toCharArray()"/>
<node CREATED="1597570894392" ID="ID_1665989484" MODIFIED="1597570902905" POSITION="left" TEXT="NOTnull-terminated character array"/>
<node CREATED="1597570928167" ID="ID_417437047" MODIFIED="1597571906504" POSITION="left" TEXT="Object - charAt(), length(), compareTo(), isEmpty(), indexOf()"/>
<node CREATED="1597571236059" ID="ID_813239165" MODIFIED="1597571243068" POSITION="right" TEXT="compare strings">
<node CREATED="1597571261090" ID="ID_1047389400" MODIFIED="1597571270432" TEXT="equals()"/>
<node CREATED="1597571272974" ID="ID_1866416397" MODIFIED="1597571284351" TEXT="== operator">
<node CREATED="1597571319478" ID="ID_488194889" MODIFIED="1597571337904" TEXT="compares memory location"/>
</node>
<node CREATED="1597571285873" ID="ID_1750794202" MODIFIED="1597571299255" TEXT="compareTo()"/>
</node>
<node CREATED="1597573209433" ID="ID_1174529527" MODIFIED="1597573209433" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="String_6999145631205242085.jpeg" />
  </body>
</html>
</richcontent>
</node>
<node CREATED="1597570752064" ID="ID_1013660634" MODIFIED="1597570752064" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="String_2471065801009548281.jpeg" />
  </body>
</html></richcontent>
</node>
</node>
</map>