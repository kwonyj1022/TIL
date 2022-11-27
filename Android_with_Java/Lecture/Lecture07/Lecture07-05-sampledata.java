import android.os.Parcel;
import android.os.Parcelable;

public class SampleData implements Parcelable {
    private int mIntData = 0;
    private String mStrData = "Superdroid";

    public int getIntData() {
        return mIntData;
    }

    public String getStringData() {
        return mStrData;
    }

    public void setIntData(int intData) {
        mIntData = intData;
    }

    public void setStringData(String strData) {
        mStrData = strData;
    }

    public SampleData(){}   // 생성자

    public SampleData(Parcel in) {  // 생성자
        mIntData = in.readInt();
        mStrData = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;   // field에 FileDescriptor 타입이 있으면 return 1 이어야 함. 그 외에는 0 리턴
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) { // 데이터를 전송할 때 호출됨
        dest.writeInt(mIntData);
        dest.writeString(mStrData);
    }

    public static final Creator<SampleData> CREATOR = new Creator<SampleData>() {   // Parcel에 있는 데이터를 꺼낼 때 사용하는 메서드
        @Override
        public SampleData createFromParcel(Parcel in) { // Parcel에 있는 객체 하나를 빼는 상황
            return new SampleData(in);
        }

        @Override
        public SampleData[] newArray(int size) {   // Parcel에 배열 안에 SampleData 객체가 여러 개 있는 것을 빼는 상황
            return new SampleData[size];
        }
    };

}
