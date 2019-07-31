(ns org.deeplearning4j.spark.models.embeddings.glove.GloveParam
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.glove GloveParam]))

(defn ->glove-param
  "Constructor.

  vector-length - `int`
  use-ada-grad - `boolean`
  lr - `double`
  gen - `org.nd4j.linalg.api.rng.Random`
  negative - `double`
  x-max - `double`
  max-count - `double`
  co-occurrence-counts - `org.apache.spark.broadcast.Broadcast`"
  (^GloveParam [^Integer vector-length ^Boolean use-ada-grad ^Double lr ^org.nd4j.linalg.api.rng.Random gen ^Double negative ^Double x-max ^Double max-count ^org.apache.spark.broadcast.Broadcast co-occurrence-counts]
    (new GloveParam vector-length use-ada-grad lr gen negative x-max max-count co-occurrence-counts)))

(defn set-co-occurrence-counts
  "co-occurrence-counts - `org.apache.spark.broadcast.Broadcast`"
  ([^GloveParam this ^org.apache.spark.broadcast.Broadcast co-occurrence-counts]
    (-> this (.setCoOccurrenceCounts co-occurrence-counts))))

(defn get-negative
  "returns: `double`"
  (^Double [^GloveParam this]
    (-> this (.getNegative))))

(defn set-max-count
  "max-count - `double`"
  ([^GloveParam this ^Double max-count]
    (-> this (.setMaxCount max-count))))

(defn get-co-occurrence-counts
  "returns: `org.apache.spark.broadcast.Broadcast<org.nd4j.linalg.primitives.CounterMap<java.lang.String,java.lang.String>>`"
  (^org.apache.spark.broadcast.Broadcast [^GloveParam this]
    (-> this (.getCoOccurrenceCounts))))

(defn set-gen
  "gen - `org.nd4j.linalg.api.rng.Random`"
  ([^GloveParam this ^org.nd4j.linalg.api.rng.Random gen]
    (-> this (.setGen gen))))

(defn getx-max
  "returns: `double`"
  (^Double [^GloveParam this]
    (-> this (.getxMax))))

(defn set-use-ada-grad
  "use-ada-grad - `boolean`"
  ([^GloveParam this ^Boolean use-ada-grad]
    (-> this (.setUseAdaGrad use-ada-grad))))

(defn set-lr
  "lr - `double`"
  ([^GloveParam this ^Double lr]
    (-> this (.setLr lr))))

(defn use-ada-grad?
  "returns: `boolean`"
  (^Boolean [^GloveParam this]
    (-> this (.isUseAdaGrad))))

(defn get-lr
  "returns: `double`"
  (^Double [^GloveParam this]
    (-> this (.getLr))))

(defn get-max-count
  "returns: `double`"
  (^Double [^GloveParam this]
    (-> this (.getMaxCount))))

(defn get-vector-length
  "returns: `int`"
  (^Integer [^GloveParam this]
    (-> this (.getVectorLength))))

(defn set-vector-length
  "vector-length - `int`"
  ([^GloveParam this ^Integer vector-length]
    (-> this (.setVectorLength vector-length))))

(defn setx-max
  "x-max - `double`"
  ([^GloveParam this ^Double x-max]
    (-> this (.setxMax x-max))))

(defn set-negative
  "negative - `double`"
  ([^GloveParam this ^Double negative]
    (-> this (.setNegative negative))))

(defn get-gen
  "returns: `org.nd4j.linalg.api.rng.Random`"
  (^org.nd4j.linalg.api.rng.Random [^GloveParam this]
    (-> this (.getGen))))

