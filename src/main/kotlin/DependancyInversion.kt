/*
       Write the code in such a way that classes or objects depend on general or abstract ideas,
       rather than the specific details.



 */



/* In this Example the class Notification Provider is dependent upon Email Class with specific details and not on
any abstract idea or interface even if we want to bring changes to how notification has to be sent we need to
change the class itself which is not a good practise
 */


/*class Email1{
    fun sendEmail(msg:String){
        println("Email Message:"+msg+"Sent Successfully");
    }
}

class NotificationProvider(private val email:Email1) {
    fun sendNotification(msg:String){
        email.sendEmail(msg);
    }
}

fun main(){
    val em = Email1()
    val ob = NotificationProvider(em)
    ob.sendNotification("Hello");

}*/

/* This problem could be solved using the below solution */

interface MessageSend{
    fun sendmessage(msg: String)
}

class Email:MessageSend{
    override fun sendmessage(msg: String) {
        println("sent email"+msg)
    }

}

class SMS:MessageSend{
    override fun sendmessage(msg: String) {
       println("sent sms:"+msg)
    }

}

class Notification(private val em:Email,private val sms:SMS){
    fun sendNotification(msg:String){
        em.sendmessage(msg);
        sms.sendmessage(msg);
    }
}

fun main(){
    val em = Email()
    val sms = SMS()
    val notify = Notification(em,sms)
    notify.sendNotification("Hello")
}

