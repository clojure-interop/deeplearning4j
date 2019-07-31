(ns org.deeplearning4j.text.sentenceiterator.StreamLineIterator$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator StreamLineIterator$Builder]))

(defn ->builder
  "Constructor.

  stream - `java.io.InputStream`"
  (^StreamLineIterator$Builder [^java.io.InputStream stream]
    (new StreamLineIterator$Builder stream)))

(defn set-fetch-size
  "lines-to-fetch - `int`

  returns: `org.deeplearning4j.text.sentenceiterator.StreamLineIterator$Builder`"
  (^org.deeplearning4j.text.sentenceiterator.StreamLineIterator$Builder [^StreamLineIterator$Builder this ^Integer lines-to-fetch]
    (-> this (.setFetchSize lines-to-fetch))))

(defn set-pre-processor
  "pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`

  returns: `org.deeplearning4j.text.sentenceiterator.StreamLineIterator$Builder`"
  (^org.deeplearning4j.text.sentenceiterator.StreamLineIterator$Builder [^StreamLineIterator$Builder this ^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn build
  "returns: `org.deeplearning4j.text.sentenceiterator.StreamLineIterator`"
  (^org.deeplearning4j.text.sentenceiterator.StreamLineIterator [^StreamLineIterator$Builder this]
    (-> this (.build))))

