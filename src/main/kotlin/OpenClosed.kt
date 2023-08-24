import java.io.File

// Class should be open for extension but closed for modification//
/* If you want to bring any kind of modifications to the existing class then you should extend the parent class and then
introduce the changes in the child class*/

open class FileErrorLog{   //Class is always open for extension//
    open fun errorLogger(error:String){
        val file= File("errors.txt")
        /*val file = File("errors2.txt")*/  /* Changing the file to which errors
        are logged might cause problems in the existing code*/
        file.appendText(
            text = error
        )
    }

}

// Instead Do this for modifying the parent class features //

class MyCustomFileErrorLog : FileErrorLog(){  /* This Class Extends the original FileErrorLog Class and then does modification
                                                preventing the modification of parent class*/
    override fun errorLogger(error: String) {
        val file = File("custom_errorFile.txt")
        file.appendText(
            text= error
        )

    }
}
