import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket.MyItem
import com.example.carrotmarket.databinding.ItemViewBinding

class MyAdapter(val items: MutableList<MyItem>) : RecyclerView.Adapter<MyAdapter.Holder>() {
    private var onClickListener: OnClickListener? = null

    // ViewHolder를 생성
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.Holder {
        return Holder(
            ItemViewBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    // ViewHolder에 데이터를 바인딩
    override fun onBindViewHolder(holder: Holder, position: Int) {
        val item = items[position]
        with(holder.binding) {
            imgView.setImageResource(item.itemImage)
            tvTitle.text = item.itemTitle
            tvLocation.text = item.address
            tvPrice.text = String.format("%,d원", item.priceInfo)
            tvChatnum.text = item.chat.toString()
            tvHeartnum.text = item.heart.toString()
        }
        holder.itemView.setOnClickListener {
            onClickListener?.onClick(position, item)
        }
    }


    override fun getItemCount(): Int {
        return items.size
    }

    // 클릭 리스너
    fun setOnClickListener(listener: OnClickListener) {
        this.onClickListener = listener
    }

    // 클릭 이벤트 처리
    interface OnClickListener {
        fun onClick(position: Int, model: MyItem)
    }


    class Holder(val binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root)
}
