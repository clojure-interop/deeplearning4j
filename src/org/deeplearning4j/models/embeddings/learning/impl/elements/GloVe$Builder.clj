(ns org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.learning.impl.elements GloVe$Builder]))

(defn ->builder
  "Constructor."
  (^GloVe$Builder []
    (new GloVe$Builder )))

(defn batch-size
  "This parameter specifies batch size for each thread. Also, if shuffle == TRUE, this batch will be shuffled before processing. Default value: 1000;

  batch-size - `int`

  returns: `org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder [^GloVe$Builder this ^Integer batch-size]
    (-> this (.batchSize batch-size))))

(defn learning-rate
  "Initial learning rate; default 0.05

  eta - `double`

  returns: `org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder [^GloVe$Builder this ^Double eta]
    (-> this (.learningRate eta))))

(defn alpha
  "Parameter in exponent of weighting function; default 0.75

  alpha - `double`

  returns: `org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder [^GloVe$Builder this ^Double alpha]
    (-> this (.alpha alpha))))

(defn max-memory
  "This method allows you to specify maximum memory available for CoOccurrence map builder.
  Please note: this option can be considered a debugging method. In most cases setting proper -Xmx argument set to JVM is enough to limit this algorithm.
  Please note: this option won't override -Xmx JVM value.

  gbytes - memory limit, in gigabytes - `int`

  returns: `org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder [^GloVe$Builder this ^Integer gbytes]
    (-> this (.maxMemory gbytes))))

(defn x-max
  "Parameter specifying cutoff in weighting function; default 100.0

  x-max - `double`

  returns: `org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder [^GloVe$Builder this ^Double x-max]
    (-> this (.xMax x-max))))

(defn shuffle
  "Parameter specifying, if cooccurrences list should be shuffled between training epochs

  really-shuffle - `boolean`

  returns: `org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder [^GloVe$Builder this ^Boolean really-shuffle]
    (-> this (.shuffle really-shuffle))))

(defn symmetric
  "Parameters specifying, if cooccurrences list should be build into both directions from any current word.

  really-symmetric - `boolean`

  returns: `org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe$Builder [^GloVe$Builder this ^Boolean really-symmetric]
    (-> this (.symmetric really-symmetric))))

(defn build
  "returns: `org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe<T>`"
  (^org.deeplearning4j.models.embeddings.learning.impl.elements.GloVe [^GloVe$Builder this]
    (-> this (.build))))

