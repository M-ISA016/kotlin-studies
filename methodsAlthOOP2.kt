fun main() {
    val buttonSuccess = Button()
    buttonSuccess.text = "Success"
    buttonSuccess.color = "00FF00"

    val buttonCancel = Button()
    buttonCancel.text = "Cancel"
    buttonCancel.color = "FF0000"
}
class Button {
    var text: String = "Success" //property
    var color: String = "Cancel"
}
