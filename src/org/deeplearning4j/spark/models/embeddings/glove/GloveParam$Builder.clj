(ns org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.glove GloveParam$Builder]))

(defn ->builder
  "Constructor."
  (^GloveParam$Builder []
    (new GloveParam$Builder )))

(defn use-ada-grad
  "use-ada-grad - `boolean`

  returns: `org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder [^GloveParam$Builder this ^Boolean use-ada-grad]
    (-> this (.useAdaGrad use-ada-grad))))

(defn co-occurrence-counts
  "co-occurrence-counts - `org.apache.spark.broadcast.Broadcast`

  returns: `org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder [^GloveParam$Builder this ^org.apache.spark.broadcast.Broadcast co-occurrence-counts]
    (-> this (.coOccurrenceCounts co-occurrence-counts))))

(defn max-count
  "max-count - `double`

  returns: `org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder [^GloveParam$Builder this ^Double max-count]
    (-> this (.maxCount max-count))))

(defn gen
  "gen - `org.nd4j.linalg.api.rng.Random`

  returns: `org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder [^GloveParam$Builder this ^org.nd4j.linalg.api.rng.Random gen]
    (-> this (.gen gen))))

(defn lr
  "lr - `double`

  returns: `org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder [^GloveParam$Builder this ^Double lr]
    (-> this (.lr lr))))

(defn negative
  "negative - `double`

  returns: `org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder [^GloveParam$Builder this ^Double negative]
    (-> this (.negative negative))))

(defn build
  "returns: `org.deeplearning4j.spark.models.embeddings.glove.GloveParam`"
  (^org.deeplearning4j.spark.models.embeddings.glove.GloveParam [^GloveParam$Builder this]
    (-> this (.build))))

(defn x-max
  "x-max - `double`

  returns: `org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder [^GloveParam$Builder this ^Double x-max]
    (-> this (.xMax x-max))))

(defn vector-length
  "vector-length - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.glove.GloveParam$Builder [^GloveParam$Builder this ^Integer vector-length]
    (-> this (.vectorLength vector-length))))

