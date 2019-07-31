(ns org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.bagofwords.vectorizer TfidfVectorizer]))

(defn ->tfidf-vectorizer
  "Constructor."
  (^TfidfVectorizer []
    (new TfidfVectorizer )))

(defn vectorize
  "Text coming from an input stream considered as one document

  is - the input stream to read from - `java.io.InputStream`
  label - the label to assign - `java.lang.String`

  returns: a dataset with a applyTransformToDestination of weights(relative to impl; could be word counts or tfidf scores) - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^TfidfVectorizer this ^java.io.InputStream is ^java.lang.String label]
    (-> this (.vectorize is label)))
  (^org.nd4j.linalg.dataset.DataSet [^TfidfVectorizer this]
    (-> this (.vectorize))))

(defn transform
  "Transforms the matrix

  text - text to transform - `java.lang.String`

  returns: INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TfidfVectorizer this ^java.lang.String text]
    (-> this (.transform text))))

(defn tfidf-word
  "word - `java.lang.String`
  word-count - `long`
  document-length - `long`

  returns: `double`"
  (^Double [^TfidfVectorizer this ^java.lang.String word ^Long word-count ^Long document-length]
    (-> this (.tfidfWord word word-count document-length))))

