package errors


class InvalidTypeException(message: String) : RuntimeException()
class InvalidValueException(message: String) : RuntimeException()
class InvalidDescriptionException(message: String) : RuntimeException()
class InvalidUserIdException(message: String) : RuntimeException()

