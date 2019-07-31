(ns org.deeplearning4j.models.word2vec.StaticWord2Vec$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec StaticWord2Vec$Builder]))

(defn ->builder
  "Constructor.

  storage - AbstractStorage implementation, key has to be Integer, index of vocabWords - `org.nd4j.linalg.compression.AbstractStorage`
  vocab-cache - VocabCache implementation, which will be used to lookup word indexes - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`"
  (^StaticWord2Vec$Builder [^org.nd4j.linalg.compression.AbstractStorage storage ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache]
    (new StaticWord2Vec$Builder storage vocab-cache)))

(defn set-cache-per-device
  "This method lets you to define if decompressed values will be cached, to avoid excessive decompressions.
  If bytes == 0 - no cache will be used.

  bytes - `long`

  returns: `org.deeplearning4j.models.word2vec.StaticWord2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.StaticWord2Vec$Builder [^StaticWord2Vec$Builder this ^Long bytes]
    (-> this (.setCachePerDevice bytes))))

(defn build
  "This method returns Static Word2Vec implementation, which is suitable for tasks like neural nets feeding.

  returns: `org.deeplearning4j.models.word2vec.StaticWord2Vec`"
  (^org.deeplearning4j.models.word2vec.StaticWord2Vec [^StaticWord2Vec$Builder this]
    (-> this (.build))))

