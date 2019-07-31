(ns org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.glove AbstractCoOccurrences$Builder]))

(defn ->builder
  "Constructor."
  (^AbstractCoOccurrences$Builder []
    (new AbstractCoOccurrences$Builder )))

(defn symmetric
  "really-symmetric - `boolean`

  returns: `org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder<T>`"
  (^org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder [^AbstractCoOccurrences$Builder this ^Boolean really-symmetric]
    (-> this (.symmetric really-symmetric))))

(defn window-size
  "window-size - `int`

  returns: `org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder<T>`"
  (^org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder [^AbstractCoOccurrences$Builder this ^Integer window-size]
    (-> this (.windowSize window-size))))

(defn vocab-cache
  "cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: `org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder<T>`"
  (^org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder [^AbstractCoOccurrences$Builder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache cache]
    (-> this (.vocabCache cache))))

(defn iterate
  "iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`

  returns: `org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder<T>`"
  (^org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder [^AbstractCoOccurrences$Builder this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (-> this (.iterate iterator))))

(defn workers
  "num-workers - `int`

  returns: `org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder<T>`"
  (^org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder [^AbstractCoOccurrences$Builder this ^Integer num-workers]
    (-> this (.workers num-workers))))

(defn max-memory
  "This method allows you to specify maximum memory available for CoOccurrence map builder.
  Please note: this option can be considered a debugging method. In most cases setting proper -Xmx argument set to JVM is enough to limit this algorithm.
  Please note: this option won't override -Xmx JVM value.

  gbytes - memory available, in GigaBytes - `int`

  returns: `org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder<T>`"
  (^org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder [^AbstractCoOccurrences$Builder this ^Integer gbytes]
    (-> this (.maxMemory gbytes))))

(defn target-file
  "Path to save cooccurrence map after construction.
  If targetFile is not specified, temporary file will be used.

  path - `java.lang.String`

  returns: `org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder<T>`"
  (^org.deeplearning4j.models.glove.AbstractCoOccurrences$Builder [^AbstractCoOccurrences$Builder this ^java.lang.String path]
    (-> this (.targetFile path))))

(defn build
  "returns: `org.deeplearning4j.models.glove.AbstractCoOccurrences<T>`"
  (^org.deeplearning4j.models.glove.AbstractCoOccurrences [^AbstractCoOccurrences$Builder this]
    (-> this (.build))))

