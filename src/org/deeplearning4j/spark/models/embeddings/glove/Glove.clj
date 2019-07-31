(ns org.deeplearning4j.spark.models.embeddings.glove.Glove
  "Spark glove"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.glove Glove]))

(defn ->glove
  "Constructor.

  tokenizer-factory-clazz - the fully qualified class name of the tokenizer - `java.lang.String`
  symmetric - whether the co occurrence counts should be symmetric - `boolean`
  window-size - the window size for co occurrence - `int`
  iterations - the number of iterations - `int`"
  (^Glove [^java.lang.String tokenizer-factory-clazz ^Boolean symmetric ^Integer window-size ^Integer iterations]
    (new Glove tokenizer-factory-clazz symmetric window-size iterations))
  (^Glove [^Boolean symmetric ^Integer window-size ^Integer iterations]
    (new Glove symmetric window-size iterations)))

(defn train
  "Train on the corpus

  rdd - the rdd to train - `org.apache.spark.api.java.JavaRDD`

  returns: the vocab and weights - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.models.word2vec.wordstore.VocabCache<org.deeplearning4j.models.word2vec.VocabWord>,org.deeplearning4j.models.glove.GloveWeightLookupTable>`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.primitives.Pair [^Glove this ^org.apache.spark.api.java.JavaRDD rdd]
    (-> this (.train rdd))))

