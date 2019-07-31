(ns org.deeplearning4j.spark.text.functions.TextPipeline
  "A spark based text pipeline
 with minimum word frequency and stop words"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.text.functions TextPipeline]))

(defn ->text-pipeline
  "Constructor.

  corpus-rdd - `org.apache.spark.api.java.JavaRDD`
  broadcas-tokenizer-var-map - `org.apache.spark.broadcast.Broadcast`

  throws: java.lang.Exception"
  (^TextPipeline [^org.apache.spark.api.java.JavaRDD corpus-rdd ^org.apache.spark.broadcast.Broadcast broadcas-tokenizer-var-map]
    (new TextPipeline corpus-rdd broadcas-tokenizer-var-map))
  (^TextPipeline []
    (new TextPipeline )))

(defn tokenize
  "returns: `org.apache.spark.api.java.JavaRDD<java.util.List<java.lang.String>>`"
  (^org.apache.spark.api.java.JavaRDD [^TextPipeline this]
    (-> this (.tokenize))))

(defn get-total-word-count
  "returns: `java.lang.Long`"
  (^java.lang.Long [^TextPipeline this]
    (-> this (.getTotalWordCount))))

(defn set-rdd-var-map
  "corpus-rdd - `org.apache.spark.api.java.JavaRDD`
  broadcas-tokenizer-var-map - `org.apache.spark.broadcast.Broadcast`"
  ([^TextPipeline this ^org.apache.spark.api.java.JavaRDD corpus-rdd ^org.apache.spark.broadcast.Broadcast broadcas-tokenizer-var-map]
    (-> this (.setRDDVarMap corpus-rdd broadcas-tokenizer-var-map))))

(defn get-vocab-cache
  "returns: `org.deeplearning4j.models.word2vec.wordstore.VocabCache<org.deeplearning4j.models.word2vec.VocabWord>`

  throws: java.lang.IllegalStateException"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabCache [^TextPipeline this]
    (-> this (.getVocabCache))))

(defn build-vocab-word-list-rdd
  ""
  ([^TextPipeline this]
    (-> this (.buildVocabWordListRDD))))

(defn get-vocab-word-list-rdd
  "returns: `org.apache.spark.api.java.JavaRDD<java.util.List<org.deeplearning4j.models.word2vec.VocabWord>>`

  throws: java.lang.IllegalStateException"
  (^org.apache.spark.api.java.JavaRDD [^TextPipeline this]
    (-> this (.getVocabWordListRDD))))

(defn get-sentence-words-count-rdd
  "returns: `org.apache.spark.api.java.JavaRDD<org.nd4j.linalg.primitives.Pair<java.util.List<java.lang.String>,java.util.concurrent.atomic.AtomicLong>>`"
  (^org.apache.spark.api.java.JavaRDD [^TextPipeline this]
    (-> this (.getSentenceWordsCountRDD))))

(defn update-and-return-accumulator-val
  "tokenized-rdd - `org.apache.spark.api.java.JavaRDD`

  returns: `org.apache.spark.api.java.JavaRDD<org.nd4j.linalg.primitives.Pair<java.util.List<java.lang.String>,java.util.concurrent.atomic.AtomicLong>>`"
  (^org.apache.spark.api.java.JavaRDD [^TextPipeline this ^org.apache.spark.api.java.JavaRDD tokenized-rdd]
    (-> this (.updateAndReturnAccumulatorVal tokenized-rdd))))

(defn get-sentence-count-rdd
  "returns: `org.apache.spark.api.java.JavaRDD<java.util.concurrent.atomic.AtomicLong>`

  throws: java.lang.IllegalStateException"
  (^org.apache.spark.api.java.JavaRDD [^TextPipeline this]
    (-> this (.getSentenceCountRDD))))

(defn filter-min-word-add-vocab
  "word-freq - `org.nd4j.linalg.primitives.Counter`"
  ([^TextPipeline this ^org.nd4j.linalg.primitives.Counter word-freq]
    (-> this (.filterMinWordAddVocab word-freq))))

(defn build-vocab-cache
  ""
  ([^TextPipeline this]
    (-> this (.buildVocabCache))))

(defn get-broad-cast-vocab-cache
  "returns: `org.apache.spark.broadcast.Broadcast<org.deeplearning4j.models.word2vec.wordstore.VocabCache<org.deeplearning4j.models.word2vec.VocabWord>>`

  throws: java.lang.IllegalStateException"
  (^org.apache.spark.broadcast.Broadcast [^TextPipeline this]
    (-> this (.getBroadCastVocabCache))))

(defn get-word-freq-acc
  "returns: `org.apache.spark.Accumulator<org.nd4j.linalg.primitives.Counter<java.lang.String>>`"
  (^org.apache.spark.Accumulator [^TextPipeline this]
    (-> this (.getWordFreqAcc))))

