import android.util.Log

class DD()  {

    companion object{
        const val TAG = "DebugLog"
        var isView : Boolean = true
    }

    fun e(message:String){
        if (isView) Log.e(TAG, buildLogMsg(message))
    }
    fun d(message:String){
        if (isView) Log.d(TAG, buildLogMsg(message))
    }
    fun w(message:String){
        if (isView) Log.w(TAG, buildLogMsg(message))
    }
    fun v(message:String){
        if (isView) Log.v(TAG, buildLogMsg(message))
    }
    fun i(message:String){
        if (isView) Log.i(TAG, buildLogMsg(message))
    }

    private fun buildLogMsg(message: String) : String{

        val ste = Thread.currentThread().stackTrace[4]
        val sb = StringBuilder()
        sb.append("[")
        sb.append(" > ")
        sb.append(ste.methodName)
        sb.append(" > #")
        sb.append(ste.lineNumber)
        sb.append("] ")

        return sb.toString()
    }

}
