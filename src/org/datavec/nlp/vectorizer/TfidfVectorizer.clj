(ns org.datavec.nlp.vectorizer.TfidfVectorizer
  "Nd4j tfidf vectorizer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.vectorizer TfidfVectorizer]))

(defn ->tfidf-vectorizer
  "Constructor."
  (^TfidfVectorizer []
    (new TfidfVectorizer )))

(defn create-vector
  "Description copied from interface: Vectorizer

  args - the arguments to create a vector with - `java.lang.Object[]`

  returns: the created vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TfidfVectorizer this args]
    (-> this (.createVector args))))

(defn fit-transform
  "Description copied from interface: Vectorizer

  reader - `org.datavec.api.records.reader.RecordReader`
  call-back - `org.datavec.api.vector.Vectorizer$RecordCallBack`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TfidfVectorizer this ^org.datavec.api.records.reader.RecordReader reader ^org.datavec.api.vector.Vectorizer$RecordCallBack call-back]
    (-> this (.fitTransform reader call-back)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^TfidfVectorizer this ^org.datavec.api.records.reader.RecordReader reader]
    (-> this (.fitTransform reader))))

(defn transform
  "Description copied from interface: Vectorizer

  record - the record to write - `org.datavec.api.records.Record`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TfidfVectorizer this ^org.datavec.api.records.Record record]
    (-> this (.transform record))))

