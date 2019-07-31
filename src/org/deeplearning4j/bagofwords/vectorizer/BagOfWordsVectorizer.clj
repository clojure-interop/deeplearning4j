(ns org.deeplearning4j.bagofwords.vectorizer.BagOfWordsVectorizer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.bagofwords.vectorizer BagOfWordsVectorizer]))

(defn vectorize
  "Text coming from an input stream considered as one document

  is - the input stream to read from - `java.io.InputStream`
  label - the label to assign - `java.lang.String`

  returns: a dataset with a applyTransformToDestination of weights(relative to impl; could be word counts or tfidf scores) - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^BagOfWordsVectorizer this ^java.io.InputStream is ^java.lang.String label]
    (-> this (.vectorize is label)))
  (^org.nd4j.linalg.dataset.DataSet [^BagOfWordsVectorizer this]
    (-> this (.vectorize))))

(defn transform
  "Description copied from interface: TextVectorizer

  text - text to transform - `java.lang.String`

  returns: INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BagOfWordsVectorizer this ^java.lang.String text]
    (-> this (.transform text))))

