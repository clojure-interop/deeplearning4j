(ns org.deeplearning4j.spark.models.embeddings.word2vec.NegativeHolder
  "Simple singleton holder class for w2v negative sampling, to avoid syn1Neg creation for each spark node"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec NegativeHolder]))

(defn *get-instance
  "returns: `org.deeplearning4j.spark.models.embeddings.word2vec.NegativeHolder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.NegativeHolder []
    (NegativeHolder/getInstance )))

(defn init-holder
  "vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  exp-table - `double[]`
  layer-size - `int`"
  ([^NegativeHolder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache exp-table ^Integer layer-size]
    (-> this (.initHolder vocab-cache exp-table layer-size))))

