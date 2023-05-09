package com.example.fragmentlifecycle.data

object MockEmailData {
    private val emails = mutableListOf<Email>()

    init {
        val email1 = Email(
            "1",
            "user1@example.com",
            "Meeting invitation",
            "Hi, I would like to invite you to our meeting tomorrow at 10 AM.",
            "2022-05-01 10:00"
        )
        val email2 = Email(
            "2",
            "user2@example.com",
            "Lunch invitation",
            "Hello, let's meet for lunch today at 1 PM at the restaurant near the office.",
            "2022-05-02 13:00"
        )
        val email3 = Email(
            "3",
            "user3@example.com",
            "Report submission",
            "Please submit your report by the end of the day.",
            "2022-05-03 18:00"
        )
        emails.addAll(listOf(email1, email2, email3))
    }

    fun getEmails(): List<Email> {
        return emails.toList()
    }

    fun getEmailById(id: String): Email? {
        return emails.find { it.id == id }
    }
}
