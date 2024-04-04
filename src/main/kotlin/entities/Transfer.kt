package entities

import errors.*
import java.time.LocalDateTime

class Transfer(val type: String, val value: Int, val description: String, val createdAt: LocalDateTime, val userId: Int) {

    init {
       validate()
    }

    private fun validate(){
        if (type != "c" && type != "d"){
           throw InvalidTypeException("invalid transaction type")
        }
        if (value <= 0){
            throw InvalidValueException("the transaction value should be greater than zero")
        }
        if (description.length > 10 || description.isEmpty()){
            throw InvalidDescriptionException("the transaction value should be greater than zero")
        }
    }

    fun isDebit(): Boolean {
        return type == "d"
    }
}