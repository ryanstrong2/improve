package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import problems.Pyramid;

import java.io.IOException;

public class TestPyramid {

    @Test
    public void testPyramid() throws IOException {
        Pyramid pyramid = new Pyramid();
        String input = "195 land\n" +
                "\n" +
                "91 sun\n" +
                "\n" +
                "266 too\n" +
                "\n" +
                "120 huge\n" +
                "\n" +
                "3 dont\n" +
                "\n" +
                "140 such\n" +
                "\n" +
                "69 noun\n" +
                "\n" +
                "227 student\n" +
                "\n" +
                "225 brown\n" +
                "\n" +
                "263 complete\n" +
                "\n" +
                "174 play\n" +
                "\n" +
                "162 cook\n" +
                "\n" +
                "40 yard\n" +
                "\n" +
                "253 clock\n" +
                "\n" +
                "80 would\n" +
                "\n" +
                "202 plain\n" +
                "\n" +
                "269 excite\n" +
                "\n" +
                "109 fire\n" +
                "\n" +
                "207 wish\n" +
                "\n" +
                "138 cool\n" +
                "\n" +
                "295 child\n" +
                "\n" +
                "128 past\n" +
                "\n" +
                "29 colony\n" +
                "\n" +
                "51 oil\n" +
                "\n" +
                "34 dog\n" +
                "\n" +
                "211 back\n" +
                "\n" +
                "226 money\n" +
                "\n" +
                "11 kind\n" +
                "\n" +
                "238 open\n" +
                "\n" +
                "101 finger\n" +
                "\n" +
                "74 touch\n" +
                "\n" +
                "114 are\n" +
                "\n" +
                "123 dad\n" +
                "\n" +
                "142 am\n" +
                "\n" +
                "165 modern\n" +
                "\n" +
                "274 meant\n" +
                "\n" +
                "150 ocean\n" +
                "\n" +
                "167 pitch\n" +
                "\n" +
                "18 suit\n" +
                "\n" +
                "166 town\n" +
                "\n" +
                "28 east\n" +
                "\n" +
                "148 over\n" +
                "\n" +
                "81 group\n" +
                "\n" +
                "185 good\n" +
                "\n" +
                "184 kind\n" +
                "\n" +
                "1 down\n" +
                "\n" +
                "273 band\n" +
                "\n" +
                "235 especially\n" +
                "\n" +
                "110 organ\n" +
                "\n" +
                "276 of\n" +
                "\n" +
                "59 fire\n" +
                "\n" +
                "79 out\n" +
                "\n" +
                "182 area\n" +
                "\n" +
                "292 touch\n" +
                "\n" +
                "284 happen\n" +
                "\n" +
                "258 sat\n" +
                "\n" +
                "71 electric\n" +
                "\n" +
                "163 wrote\n" +
                "\n" +
                "65 buy\n" +
                "\n" +
                "10 lot\n" +
                "\n" +
                "129 stop\n" +
                "\n" +
                "297 corn\n" +
                "\n" +
                "24 where\n" +
                "\n" +
                "133 check\n" +
                "\n" +
                "239 live\n" +
                "\n" +
                "135 best\n" +
                "\n" +
                "171 hold\n" +
                "\n" +
                "130 cause\n" +
                "\n" +
                "175 grand\n" +
                "\n" +
                "241 present\n" +
                "\n" +
                "87 indicate\n" +
                "\n" +
                "161 counter\n" +
                "\n" +
                "137 we\n" +
                "\n" +
                "210 like\n" +
                "\n" +
                "93 visit\n" +
                "\n" +
                "47 state\n" +
                "\n" +
                "220 morning\n" +
                "\n" +
                "233 true\n" +
                "\n" +
                "183 are\n" +
                "\n" +
                "280 ball\n" +
                "\n" +
                "288 history\n" +
                "\n" +
                "5 seat\n" +
                "\n" +
                "127 rain\n" +
                "\n" +
                "200 less\n" +
                "\n" +
                "243 glass\n" +
                "\n" +
                "55 tone\n" +
                "\n" +
                "111 song\n" +
                "\n" +
                "143 fair\n" +
                "\n" +
                "270 element\n" +
                "\n" +
                "186 speed\n" +
                "\n" +
                "112 produce\n" +
                "\n" +
                "125 quotient\n" +
                "\n" +
                "246 sand\n" +
                "\n" +
                "156 begin\n" +
                "\n" +
                "136 moment\n" +
                "\n" +
                "23 offer\n" +
                "\n" +
                "149 probable\n" +
                "\n" +
                "299 all\n" +
                "\n" +
                "134 necessary\n" +
                "\n" +
                "298 post\n" +
                "\n" +
                "44 cent\n" +
                "\n" +
                "205 happen\n" +
                "\n" +
                "76 speech\n" +
                "\n" +
                "83 object\n" +
                "\n" +
                "21 silver\n" +
                "\n" +
                "14 third\n" +
                "\n" +
                "157 crease\n" +
                "\n" +
                "176 wait\n" +
                "\n" +
                "90 triangle\n" +
                "\n" +
                "58 idea\n" +
                "\n" +
                "64 clothe\n" +
                "\n" +
                "22 young\n" +
                "\n" +
                "108 discuss\n" +
                "\n" +
                "102 field\n" +
                "\n" +
                "57 company\n" +
                "\n" +
                "221 capital\n" +
                "\n" +
                "272 compare\n" +
                "\n" +
                "158 chart\n" +
                "\n" +
                "139 possible\n" +
                "\n" +
                "94 written\n" +
                "\n" +
                "27 remember\n" +
                "\n" +
                "104 mile\n" +
                "\n" +
                "39 cold\n" +
                "\n" +
                "168 lady\n" +
                "\n" +
                "259 felt\n" +
                "\n" +
                "285 against\n" +
                "\n" +
                "228 skin\n" +
                "\n" +
                "56 prepare\n" +
                "\n" +
                "267 he\n" +
                "\n" +
                "84 card\n" +
                "\n" +
                "240 organ\n" +
                "\n" +
                "154 object\n" +
                "\n" +
                "255 our\n" +
                "\n" +
                "19 major\n" +
                "\n" +
                "73 discuss\n" +
                "\n" +
                "214 system\n" +
                "\n" +
                "17 hole\n" +
                "\n" +
                "121 above\n" +
                "\n" +
                "281 they\n" +
                "\n" +
                "98 produce\n" +
                "\n" +
                "35 straight\n" +
                "\n" +
                "264 level\n" +
                "\n" +
                "245 though\n" +
                "\n" +
                "85 modern\n" +
                "\n" +
                "260 dry\n" +
                "\n" +
                "300 bought\n" +
                "\n" +
                "291 milk\n" +
                "\n" +
                "190 make\n" +
                "\n" +
                "118 show\n" +
                "\n" +
                "95 middle\n" +
                "\n" +
                "88 center\n" +
                "\n" +
                "61 blood\n" +
                "\n" +
                "46 speak\n" +
                "\n" +
                "7 prove\n" +
                "\n" +
                "249 select\n" +
                "\n" +
                "13 power\n" +
                "\n" +
                "106 come\n" +
                "\n" +
                "203 brown\n" +
                "\n" +
                "4 experiment\n" +
                "\n" +
                "198 strong\n" +
                "\n" +
                "170 hurry\n" +
                "\n" +
                "283 touch\n" +
                "\n" +
                "68 reach\n" +
                "\n" +
                "37 case\n" +
                "\n" +
                "97 beat\n" +
                "\n" +
                "189 over\n" +
                "\n" +
                "290 dry\n" +
                "\n" +
                "144 hill\n" +
                "\n" +
                "113 company\n" +
                "\n" +
                "26 opposite\n" +
                "\n" +
                "15 work\n" +
                "\n" +
                "48 field\n" +
                "\n" +
                "237 felt\n" +
                "\n" +
                "41 prepare\n" +
                "\n" +
                "152 now\n" +
                "\n" +
                "265 his\n" +
                "\n" +
                "116 stay\n" +
                "\n" +
                "160 toward\n" +
                "\n" +
                "271 observe\n" +
                "\n" +
                "244 time\n" +
                "\n" +
                "78 stop\n" +
                "\n" +
                "251 possible\n" +
                "\n" +
                "33 card\n" +
                "\n" +
                "268 prepare\n" +
                "\n" +
                "43 current\n" +
                "\n" +
                "224 compare\n" +
                "\n" +
                "115 neighbor\n" +
                "\n" +
                "213 thus\n" +
                "\n" +
                "262 include\n" +
                "\n" +
                "124 copy\n" +
                "\n" +
                "66 bit\n" +
                "\n" +
                "9 stead\n" +
                "\n" +
                "92 does\n" +
                "\n" +
                "229 general\n" +
                "\n" +
                "178 solve\n" +
                "\n" +
                "275 glad\n" +
                "\n" +
                "36 duck\n" +
                "\n" +
                "287 offer\n" +
                "\n" +
                "30 happen\n" +
                "\n" +
                "286 ball\n" +
                "\n" +
                "119 bread\n" +
                "\n" +
                "169 like\n" +
                "\n" +
                "201 machine\n" +
                "\n" +
                "63 come\n" +
                "\n" +
                "191 any\n" +
                "\n" +
                "196 band\n" +
                "\n" +
                "209 it\n" +
                "\n" +
                "278 section\n" +
                "\n" +
                "199 close\n" +
                "\n" +
                "25 heavy\n" +
                "\n" +
                "155 produce\n" +
                "\n" +
                "86 got\n" +
                "\n" +
                "231 possible\n" +
                "\n" +
                "117 insect\n" +
                "\n" +
                "206 way\n" +
                "\n" +
                "147 before\n" +
                "\n" +
                "222 men\n" +
                "\n" +
                "54 bird\n" +
                "\n" +
                "179 ease\n" +
                "\n" +
                "67 trade\n" +
                "\n" +
                "293 winter\n" +
                "\n" +
                "208 am\n" +
                "\n" +
                "141 repeat\n" +
                "\n" +
                "212 first\n" +
                "\n" +
                "230 to\n" +
                "\n" +
                "2 each\n" +
                "\n" +
                "126 guide\n" +
                "\n" +
                "131 column\n" +
                "\n" +
                "252 single\n" +
                "\n" +
                "204 remember\n" +
                "\n" +
                "38 wild\n" +
                "\n" +
                "247 major\n" +
                "\n" +
                "42 coast\n" +
                "\n" +
                "82 class\n" +
                "\n" +
                "45 done\n" +
                "\n" +
                "172 jump\n" +
                "\n" +
                "49 sister\n" +
                "\n" +
                "279 feel\n" +
                "\n" +
                "242 check\n" +
                "\n" +
                "250 fire\n" +
                "\n" +
                "6 nine\n" +
                "\n" +
                "151 indicate\n" +
                "\n" +
                "60 parent\n" +
                "\n" +
                "99 whole\n" +
                "\n" +
                "159 her\n" +
                "\n" +
                "53 the\n" +
                "\n" +
                "89 temperature\n" +
                "\n" +
                "132 design\n" +
                "\n" +
                "164 big\n" +
                "\n" +
                "12 skill\n" +
                "\n" +
                "192 friend\n" +
                "\n" +
                "188 hit\n" +
                "\n" +
                "289 wait\n" +
                "\n" +
                "296 instant\n" +
                "\n" +
                "32 blow\n" +
                "\n" +
                "181 about\n" +
                "\n" +
                "236 chick\n" +
                "\n" +
                "219 answer\n" +
                "\n" +
                "173 man\n" +
                "\n" +
                "180 material\n" +
                "\n" +
                "234 current\n" +
                "\n" +
                "223 think\n" +
                "\n" +
                "256 print\n" +
                "\n" +
                "282 nor\n" +
                "\n" +
                "277 better\n" +
                "\n" +
                "103 example\n" +
                "\n" +
                "194 people\n" +
                "\n" +
                "72 drink\n" +
                "\n" +
                "107 gun\n" +
                "\n" +
                "193 together\n" +
                "\n" +
                "254 cost\n" +
                "\n" +
                "96 require\n" +
                "\n" +
                "197 or\n" +
                "\n" +
                "215 people\n" +
                "\n" +
                "218 planet\n" +
                "\n" +
                "257 ease\n" +
                "\n" +
                "8 ready\n" +
                "\n" +
                "75 enough\n" +
                "\n" +
                "77 sugar\n" +
                "\n" +
                "105 deal\n" +
                "\n" +
                "16 with\n" +
                "\n" +
                "146 us\n" +
                "\n" +
                "216 share\n" +
                "\n" +
                "145 office\n" +
                "\n" +
                "187 protect\n" +
                "\n" +
                "52 low\n" +
                "\n" +
                "248 thus\n" +
                "\n" +
                "100 farm\n" +
                "\n" +
                "70 oxygen\n" +
                "\n" +
                "20 fire\n" +
                "\n" +
                "122 force\n" +
                "\n" +
                "232 select\n" +
                "\n" +
                "217 paragraph\n" +
                "\n" +
                "177 always\n" +
                "\n" +
                "153 poem\n" +
                "\n" +
                "31 chick\n" +
                "\n" +
                "50 planet\n" +
                "\n" +
                "62 fact\n" +
                "\n" +
                "294 moment\n" +
                "\n" +
                "261 term";
        String result = pyramid.pyramid(input);
        assertEquals("I love comp", result);
    }
}
