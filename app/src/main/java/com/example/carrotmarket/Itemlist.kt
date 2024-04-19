import com.example.carrotmarket.MyItem
import com.example.carrotmarket.R

object Itemlist {
    fun getCarrotMarketData(): MutableList<MyItem> {

        val appleList = mutableListOf<MyItem>()
        val data1 = MyItem(
            R.drawable.sample1,
            "산지 한달된 선풍기 팝니다",
            "이사가서 필요가 없어졌어요 급하게 내놓습니다",
            "탈북자",
            1000,
            "서울 중구역 중성동",
            13,
            25
        )
        appleList.add(data1)
        val data2 = MyItem(
            R.drawable.sample2,
            "로동자의 냉장고",
            "이사로인해 내놔요",
            "안마담",
            2000,
            "대성구역 룡남동",
            8,
            28
        )
        appleList.add(data2)
        val data3 = MyItem(
            R.drawable.sample3,
            "작은 손지갑",
            "아주 품질이 좋은 지갑이요\n사용감이 있어서 싸게 내놔요",
            "코코유",
            1000,
            "평천 북성 1동",
            23,
            5
        )
        appleList.add(data3)
        val data4 = MyItem(
            R.drawable.sample4,
            "비밀돈통",
            "돈통\n떼서 가져가야함\n원산시석현동\n탈북하는관계로 싸게 팝니다",
            "니꼴레",
            1000,
            "원산시 석현동",
            14,
            17
        )
        appleList.add(data4)
        val data5 = MyItem(
            R.drawable.sample5,
            "남한의 손전화기 팝니다",
            "남한의 손전화기 팝니다\n항시 보관함 씌워서 썼고\n 보호종이 한장챙겨드립니다\n화면에 살짝 까진거 말고\n 크게 이상은없습니다!",
            "절명",
            15000,
            "평천 북성2동",
            22,
            9
        )
        appleList.add(data5)
        val data6 = MyItem(
            R.drawable.sample6,
            "브라다 복주머니가방",
            "뜯어진 곳 없이 깨끗하오\n정품여부모르오",
            "아주작게",
            3000,
            "보통강구역 운하동",
            25,
            16
        )
        appleList.add(data6)
        val data7 = MyItem(
            R.drawable.sample7,
            "바다가 보이는 집 아주 높고 아주 넓은\n1일 숙박권 마음을 다스리는 숙소 별장",
            "려명거리 륭흥동 두개의 층\n 고급집 1일 숙박권\n(바람기계가 없기에 낮은 가격으로 변경했으며\n 8월 초 가장 더운날 다녀가신 분 경우 시원했다고 잘 지내다 가셨습니다)\n1. 인원: 6명 기준입니다. 1인 200원 추가요금\n2. 장소: 려명거리 륭흥동, 32-33층\n3. 취사도구, 침구류, 세면도구, 손머리말리개 2개, 선풍기 4대 구비\n4. 예약방법: 예약금 50,000원 하시면 저희는 명함을 드리며 입실 오전 잔금 입금하시면 저희는 동.호수를 알려드리며 고객님은 예약자분 신분증 앞면 주민번호 뒷자리 가리시거나 지우시고 문자로 보내주시면 저희는 납작종이 우편함에 놓아 둡니다.\n5. 33층 옥상 야외 마당 있음, 가스버너 있음\n6. 고기 굽기 가능\n7. 입실 오후 3시, 오전 11시 퇴실, 정리, 정돈 , 가스잠그개 잠금 부탁드립니다.\n8. 층간소음 주의 부탁드립니다.\n9. 방3개, 화장실3개, 자동변소 3개\n10. 저희 집안이 쓰는 별장입니다.",
            "려명거리 륭흥동",
            1000,
            "려명거리 륭흥동",
            142,
            54
        )
        appleList.add(data7)
        val data8 = MyItem(
            R.drawable.sample8,
            "시아넬 손가방",
            "남한에서 인기많은 시아넬 손가방 금방 가져가요 !\n \n색상 : 블랙\n사이즈 : 25.5cm * 17.5cm * 8cm\n구성 : 본품먼지가방\n\n급하게 돈이 필요해서 팝니다 ㅠ ㅠ",
            "난쉽",
            5500,
            "동래구 온천제2동",
            31,
            7
        )
        appleList.add(data8)
        val data9 = MyItem(
            R.drawable.sample9,
            "4행정 로동자의 기계 판매합니다.",
            "3년전에 사서 한번 사용하고 그대로 둔 상태입니다.\n 요즘 사용은 안해봤습니다. \n그래서 저렴하게 내 놓습니다. 중고라 반품은 어렵습니다.\n",
            "알뜰한",
            3000,
            "평천 북성 2동",
            7,
            28
        )
        appleList.add(data9)
        val data10 = MyItem(
            R.drawable.sample10,
            "중간 크기 가방",
            "22년 신세계남한 구매입니당\n중간크기 남한가방\n구매해서 몇번사용했어요\n까짐 없시오.\n타지역에서 보내는거라 택배로 진행합니당!",
            "똑태현",
            19000,
            "대성구역 륭정동",
            40,
            6
        )
        appleList.add(data10)

        return appleList

    }
}