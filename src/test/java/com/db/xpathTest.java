package com.db;

import junit.framework.TestResult;
import org.junit.Test;
import static org.junit.Assert.*;

public class xpathTest extends TestResult {
	private static xpath testClass = new xpath();

//     @Test
//     public void testTA1() {
//         assertEquals("TITLETITLETITLETITLETITLETITLE", testClass.executeCode("doc(\"input_caesar.xml\")//(ACT,PERSONAE)/TITLE"));
//     }
//
//     @Test
//     public void testTA2() {
//         assertEquals("TITLE", testClass.executeCode("doc(\"input_caesar.xml\")//ACT[./TITLE]/*/SPEECH/../TITLE"));
//     }
//
//     @Test
//     public void testTA3() {
//         assertEquals("TITLE", testClass.executeCode("doc(\"input_caesar.xml\")//ACT[./TITLE]/*/SPEECH/../*/.././TITLE"));
//     }
//
//     @Test
//     public void testTA4() {
//         assertEquals("TITLE", testClass.executeCode("doc(\"input_caesar.xml\")//ACT[(./TITLE)==(./TITLE)]/*/SPEECH/../TITLE"));
//     }
//
//     @Test
//     public void testTA5() {
//         assertEquals("", testClass.executeCode("doc(\"input_caesar.xml\")//ACT[not(./TITLE)==(./TITLE)]/*/SPEECH/../TITLE"));
//     }
//
//     @Test
//     public void testSlashTagname() {
//         assertEquals("FM", testClass.executeCode("doc(\"input_caesar.xml\")/FM"));
//     }
//
//     @Test
//     public void testSlashSlashTagname() {
//         assertEquals("ACTACTACTACTACT", testClass.executeCode("doc(\"input_caesar.xml\")//ACT"));
//     }
//
//     @Test
//     public void testApCommaRp() {
//         // This is wrong and doesn't happen!! Wrong xpath semantic
//         assertEquals("FMPERSONAE", testClass.executeCode("doc(\"input_caesar.xml\")/FM,PERSONAE"));
//     }
//
//     @Test
//     public void testSlashTagnameSlashStar() {
//         assertEquals("PPPP", testClass.executeCode("doc(\"input_caesar.xml\")/FM/*"));
//     }
//
//     @Test
//     public void testSlashStar() {
//         assertEquals("TITLEFMPERSONAESCNDESCRPLAYSUBTACTACTACTACTACT", testClass.executeCode("doc(\"input_caesar.xml\")/*"));
//     }
//
//     @Test
//     public void testSlashRpSlashRpSlashRp() {
//         assertEquals("GRPDESCRGRPDESCRGRPDESCRGRPDESCRGRPDESCRGRPDESCR", testClass.executeCode("doc(\"input_caesar.xml\")/PERSONAE/PGROUP/GRPDESCR"));
//     }
//
//     @Test
//     public void testSlashRpSlashSlashRp() {
//         assertEquals("GRPDESCRGRPDESCRGRPDESCRGRPDESCRGRPDESCRGRPDESCR", testClass.executeCode("doc(\"input_caesar.xml\")/PERSONAE//GRPDESCR"));
//     }
//
//     @Test
//     public void testSlashRpSlashSlashRp2() {
//         // test descendent issue
//         assertEquals(new String(new char[2596]).replace("\0", "LINE"), testClass.executeCode("doc(\"input_caesar.xml\")/ACT//LINE"));
//     }
//
//     @Test
//     public void testSlashRpSlashSlashRpWithSelf() {
//         assertEquals("PERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONA" +
//                         "PERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONA" +
//                         "PERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONA" +
//                         "PERSONAPERSONAPERSONAPERSONAPERSONAPERSONA"
//                 , testClass.executeCode("doc(\"input_caesar.xml\")/PERSONAE//PERSONA"));
//     }
//
//
//     @Test
//     public void testDotDot() {
//         assertEquals("FM", testClass.executeCode("doc(\"input_caesar.xml\")/FM/P/.."));
//     }
//
//     @Test
//     public void testDot() {
//         assertEquals("PPPP", testClass.executeCode("doc(\"input_caesar.xml\")/FM/P/."));
//     }
//
//     @Test
//     public void testText() {
//         assertEquals(    "Text placed in the public domain by Moby Lexical Tools, 1992."+
//                         "SGML markup by Jon Bosak, 1992-1994."+
//                         "XML version by Jon Bosak, 1996-1998."+
//                         "This work may be freely copied and distributed worldwide."
//                 , testClass.executeCode("doc(\"input_caesar.xml\")/FM/P/text()"));
//     }
//
//     @Test
//     public void testSlashSlashPersona() {
//         assertEquals("PERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONA" +
//                         "PERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONA" +
//                         "PERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONAPERSONA" +
//                         "PERSONAPERSONAPERSONAPERSONAPERSONAPERSONA", testClass.executeCode("doc(\"input_caesar.xml\")//PERSONA"));
//     }
//
// //    @Test
// //    public void testRpCommaRp() {
// //        assertEquals("TITLEPERSONAE", testClass.executeCode("doc(\"input_caesar.xml\")/PERSONAE/TITLE,PERSONAE"));
// //    }
//
//     @Test
//     public void testAtt() {
//         assertEquals("att123attabc", testClass.executeCode("doc(\"input_caesar.xml\")/FM/P/@att"));
//     }
//
//     @Test
//     public void testAtt1() {
//         assertEquals("att1456att1def", testClass.executeCode("doc(\"input_caesar.xml\")/FM/P/@att1"));
//     }
// //    @Test
// //    public void testAttEq() {
// //    	assertEquals("", testClass.executeCode("doc(\"input_caesar.xml\")/FM/P[@att = @att]"));
// //    }
//
//     @Test
//     public void testIsCorrect() {
//     	assertEquals("PERSONAE", testClass.executeCode("doc(\"input_caesar.xml\")/PERSONAE[TITLE is ../PERSONAE/TITLE]"));
//     }
//
//     @Test
//     public void testIsFail() {
//     	assertEquals("", testClass.executeCode("doc(\"input_caesar.xml\")/PERSONAE[TITLE is ../PERSONAE/PERSONA]"));
//     }
//
//     @Test
//     public void testIssymbolCorrect() {
//         assertEquals("PERSONAE", testClass.executeCode("doc(\"input_caesar.xml\")/PERSONAE[TITLE == ../PERSONAE/TITLE]"));
//     }
//
//     @Test
//     public void testIssymbolFail() {
//         assertEquals("", testClass.executeCode("doc(\"input_caesar.xml\")/PERSONAE[TITLE == ../PERSONAE/PERSONA]"));
//     }
//
//     @Test
//     public void testEq() {
//         assertEquals("ACTACTACTACTACT", testClass.executeCode("doc(\"input_caesar.xml\")//ACT[(./TITLE) eq (./TITLE)]"));
//     }
//
//     @Test
//     public void testEqsymbol() {
//         assertEquals("ACTACTACTACTACT", testClass.executeCode("doc(\"input_caesar.xml\")//ACT[(./TITLE) == (./TITLE)]"));
//     }

//     @Test
//     public void testRp() {
//         assertEquals("TITLETITLETITLETITLETITLETITLE", testClass.executeCode("doc(\"input_caesar.xml\")/(ACT,PERSONAE)/TITLE"));
//     }
//
//     @Test
//     public void testRpSlashRpMultiple() {
//         assertEquals("TITLETITLETITLETITLETITLETITLETITLETITLETITLETITLETITLETITLETITLETITLETITLETITLETITLETITLE", testClass.executeCode("doc(\"input_caesar.xml\")/(PERSONAE,ACT)/(PGROUP,SCENE)/TITLE"));
//     }
//
//     @Test
//     public void testNot() {
//         assertEquals("",testClass.executeCode("doc(\"input_caesar.xml\")/ACT[not(./TITLE)==(./TITLE)]"));
//     }
//
//     @Test
//     public void testfwithTagName() {
//         assertEquals("PGROUPPGROUPPGROUPPGROUPPGROUPPGROUP",testClass.executeCode("doc(\"input_caesar.xml\")/PERSONAE/PGROUP[PERSONA]"));
//     }
//
//     @Test
//     public void testfwithAtt() {
//         assertEquals("PP",testClass.executeCode("doc(\"input_caesar.xml\")/FM/P[@att]"));
//     }
//
//     @Test
//     public void testfwithText() {
//         assertEquals("PPPP",testClass.executeCode("doc(\"input_caesar.xml\")/FM/P[text()]"));
//     }
//
//     // @Test
//     // public void testF_F() {
//     // 	assertEquals("",testClass.executeCode("doc(\"input_caesar.xml\")/FM/P[(@att2) and (@att1 or @att2)]"));
//     // }

//    @Test
//    public void testXQVarNull() {
//        assertEquals("Wrong",testClass.executeCode("$abc"));
//    }
//
//    @Test
//    public void testXQString() {
//        assertEquals("abc",testClass.executeCode("abc"));
//    }
//
//    @Test
//    public void testXQAp() {
//        assertEquals("PPPP",testClass.executeCode("doc(\"input_caesar.xml\")/FM/P"));
//    }
//
//    @Test
//    public void testXQXQ() {
//        // TODO
//    }
//
//    @Test
//    public void testXQSlashXQ() {
//        // TODO
//    }
//
//    @Test
//    public void testXQCommaXQ() {
//        assertEquals("FMPPPP",testClass.executeCode("doc(\"input_caesar.xml\")/FM,doc(\"input_caesar.xml\")/FM/P"));
//    }
//
//    @Test
//    public void testForReturn() {
//        assertEquals("PPPP",testClass.executeCode("for $a in doc(\"input_caesar.xml\")/FM return $a/P"));
//    }
//    @Test
//    public void testTA3() {
//    	assertEquals("PERSONA", testClass.executeCode(
//    			"for $a in doc(\"input_caesar.xml\")//PERSONAE, $b in $a/PERSONA return "));
//    }
//    
//    @Test
//    public void testTA1_easy() {
//    	assertEquals("", testClass.executeCode("for $a in doc(\"input_caesar.xml\")//ACT " +
//                                                             "where empty ( for $sp in $a/SCENE/SPEECH/SPEAKER where $sp/text() = \"CASCA\" return <speaker> {$sp/text()}</speaker> )" ));
//    }
//    
//     @Test
//     public void testTA1_mid() {
//         assertEquals("", testClass.executeCode("for $a in doc(\"input_caesar.xml\")//ACT where empty ( for $sp in $a/SCENE/SPEECH/SPEAKER" +
//    			" where $sp/text() = \"CASCA\" return <speaker> {$sp/text()}</speaker> ) return <act>{$a/TITLE/text()}</act>"));
//     }
    
    // @Test
    // public void testTA1_ALL() {
    //     assertEquals("actsactact", testClass.executeCode("<acts>{for $a in doc(\"input_caesar.xml\")//ACT" +
    //             " where empty ( for $sp in $a/SCENE/SPEECH/SPEAKER where $sp/text() = \"CASCA\"" +
    //             " return <speaker> {$sp/text()}</speaker> ) return <act>{$a/TITLE/text()}</act>}</acts>"));
    // }

    // @Test
    // public void testTA1_danny() {
    //     assertEquals("actsact", testClass.executeCode("<acts>{for $a in doc(\"input_caesar.xml\")/FM" +
    //             " where empty($a/P) return <act>{$a/P/text()}</act>}</acts>"));
    // }

    // @Test
    // public void testTA2() {
    // 	assertEquals("PERSONA", testClass.executeCode(
    // 			"<result>{ \n" +
    //                     "for $a in (for $s in doc(\"j_caesar.xml\")//ACT \n" +
    //                     "  return $s), \n" +
    //                     "$sc in (for $t in $a/SCENE \n" +
    //                     "  return $t), \n" +
    //                     "$sp in (for $d in $sc/SPEECH \n" +
    //                     "  return $d) \n" +
    //                     "where $sp/LINE/text() = \"Et tu, Brute! Then fall, Caesar.\" \n" +
    //                     "return <who>{$sp/SPEAKER/text()}</who>, \n" +
    //                     "<when>{ \n" +
    //                     "<act>{$a/TITLE/text()}</act>, \n" +
    //                     "<scene>{$sc/TITLE/text()}</scene> \n" +
    //                     "}</when> \n" +
    //                     "} </result>\n"));
    // }

    // @Test
    // public void testTA3() {
    //     assertEquals("PERSONA", testClass.executeCode(
    //             "for $a in doc(\"input_caesar.xml\")//PERSONAE, $b in $a/PERSONA where $b/text() = \"JULIUS CAESAR\" return $b"));
    // }
    
//    @Test
//    public void testTA2_easy() {
//    	assertEquals("", testClass.executeCode("for $a in ("
//    			+ "for $s in doc(\"j_caesar.xml\")//ACT return $s),"
//    			+ "$sc in (for $t in $a/SCENE return $t),"
//    			+ " $sp in (for $d in $sc/SPEECH return $d)"));
//    }
//
//    @Test
//    public void testTA2_mid() {
//    	assertEquals("", testClass.executeCode("for $a in (for $s in doc(\"j_caesar.xml\")//ACT return $s)," + 
//    			"$sc in (for $t in $a/SCENE return $t)," + 
//    			"$sp in (for $d in $sc/SPEECH return $d)" + 
//    			"where $sp/LINE/text() = \"Et tu, Brute! Then fall, Caesar.\"" + 
//    			"return <who>{$sp/SPEAKER/text()}</who>"));
//    }
    
//    @Test
//    public void testTA2_hard() {
//    	assertEquals("<result><who>CAESAR</who><when><act>ACT III</act>"
//    			+ "<scene>SCENE I.  Rome. Before the Capitol; the Senate sitting above.</scene></when></result>", testClass.executeCode("<result>{" + 
//    			"for $a in (for $s in doc(\"input_caesar.xml\")//ACT return $s)," + 
//    			"$sc in (for $t in $a/SCENE return $t),$sp in (for $d in $sc/SPEECH return $d)" + 
//    			"where $sp/LINE/text() = \"Et tu, Brute! Then fall, Caesar.\"" + 
//    			"return <who>{$sp/SPEAKER/text()}</who>," + 
//    			"<when>{<act>{$a/TITLE/text()}</act>," + 
//    			"<scene>{$sc/TITLE/text()}</scene>}</when>} </result>"));
//    }
    
//    @Test
//    public void testTA3_all() {
//    	assertEquals("<result><PERSONA>JULIUS CAESAR</PERSONA><PERSONA>Another Poet</PERSONA></result>",
//    			"<result>{for $a in doc(\"input_caesar.xml\")//PERSONAE, $b in $a/PERSONA" + 
//    			"where ($b/text() = \"JULIUS CAESAR\") or ($b/text()= \"Another Poet\") return $b} </result>");
//    }
//    
//   @Test
//   public void testTA4_all() {
//   	assertEquals("Wrong",
//            testClass.executeCode("<act>{}</act>"));
//   }
    
}
