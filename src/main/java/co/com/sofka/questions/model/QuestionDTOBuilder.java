package co.com.sofka.questions.model;

import java.util.ArrayList;
import java.util.List;

public final class QuestionDTOBuilder {
    private String id;
    private String userId;
    private String question;
    private String type;
    private String category;
    private List<AnswerDTO> answers;
    private Integer numberOfReviews = 0;
    private Integer sumOfReviewScores = 0;
    private List<String> userReviews = new ArrayList<>();
    private String userEmail;

    private QuestionDTOBuilder() {
    }

    public static QuestionDTOBuilder aQuestionDTO() {
        return new QuestionDTOBuilder();
    }

    public QuestionDTOBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public QuestionDTOBuilder withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public QuestionDTOBuilder withQuestion(String question) {
        this.question = question;
        return this;
    }

    public QuestionDTOBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public QuestionDTOBuilder withCategory(String category) {
        this.category = category;
        return this;
    }

    public QuestionDTOBuilder withAnswers(List<AnswerDTO> answers) {
        this.answers = answers;
        return this;
    }

    public QuestionDTOBuilder withNumberOfReviews(Integer numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
        return this;
    }

    public QuestionDTOBuilder withSumOfReviewScores(Integer sumOfReviewScores) {
        this.sumOfReviewScores = sumOfReviewScores;
        return this;
    }

    public QuestionDTOBuilder withUserReviews(List<String> userReviews) {
        this.userReviews = userReviews;
        return this;
    }

    public QuestionDTOBuilder withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public QuestionDTO build() {
        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setId(id);
        questionDTO.setUserId(userId);
        questionDTO.setQuestion(question);
        questionDTO.setType(type);
        questionDTO.setCategory(category);
        questionDTO.setAnswers(answers);
        questionDTO.setNumberOfReviews(numberOfReviews);
        questionDTO.setSumOfReviewScores(sumOfReviewScores);
        questionDTO.setUserReviews(userReviews);
        questionDTO.setUserEmail(userEmail);
        return questionDTO;
    }
}
