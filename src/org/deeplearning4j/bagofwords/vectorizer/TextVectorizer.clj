(ns org.deeplearning4j.bagofwords.vectorizer.TextVectorizer
  "Vectorizes text"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.bagofwords.vectorizer TextVectorizer]))

(defn get-vocab-cache
  "The vocab sorted in descending order

  returns: the vocab sorted in descending order - `org.deeplearning4j.models.word2vec.wordstore.VocabCache<org.deeplearning4j.models.word2vec.VocabWord>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabCache [^TextVectorizer this]
    (-> this (.getVocabCache))))

(defn vectorize
  "Text coming from an input stream considered as one document

  is - the input stream to read from - `java.io.InputStream`
  label - the label to assign - `java.lang.String`

  returns: a dataset with a applyTransformToDestination of weights(relative to impl; could be word counts or tfidf scores) - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^TextVectorizer this ^java.io.InputStream is ^java.lang.String label]
    (-> this (.vectorize is label))))

(defn fit
  "Train the model"
  ([^TextVectorizer this]
    (-> this (.fit))))

(defn transform
  "Transforms the matrix

  text - text to transform - `java.lang.String`

  returns: INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TextVectorizer this ^java.lang.String text]
    (-> this (.transform text))))

(defn num-words-encountered
  "Returns the number of words encountered so far

  returns: the number of words encountered so far - `long`"
  (^Long [^TextVectorizer this]
    (-> this (.numWordsEncountered))))

(defn get-index
  "Inverted index

  returns: the inverted index for this vectorizer - `org.deeplearning4j.text.invertedindex.InvertedIndex<org.deeplearning4j.models.word2vec.VocabWord>`"
  (^org.deeplearning4j.text.invertedindex.InvertedIndex [^TextVectorizer this]
    (-> this (.getIndex))))

