(ns org.deeplearning4j.models.sequencevectors.transformers.impl.GraphTransformer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.transformers.impl GraphTransformer$Builder]))

(defn ->builder
  "Constructor.

  walker - `org.deeplearning4j.models.sequencevectors.graph.walkers.GraphWalker`"
  (^GraphTransformer$Builder [^org.deeplearning4j.models.sequencevectors.graph.walkers.GraphWalker walker]
    (new GraphTransformer$Builder walker))
  (^GraphTransformer$Builder []
    (new GraphTransformer$Builder )))

(defn set-labels-provider
  "provider - `org.deeplearning4j.text.labels.LabelsProvider`

  returns: `org.deeplearning4j.models.sequencevectors.transformers.impl.GraphTransformer$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.transformers.impl.GraphTransformer$Builder [^GraphTransformer$Builder this ^org.deeplearning4j.text.labels.LabelsProvider provider]
    (-> this (.setLabelsProvider provider))))

(defn set-graph-walker
  "walker - `org.deeplearning4j.models.sequencevectors.graph.walkers.GraphWalker`

  returns: `org.deeplearning4j.models.sequencevectors.transformers.impl.GraphTransformer$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.transformers.impl.GraphTransformer$Builder [^GraphTransformer$Builder this ^org.deeplearning4j.models.sequencevectors.graph.walkers.GraphWalker walker]
    (-> this (.setGraphWalker walker))))

(defn set-vocab-cache
  "vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: `org.deeplearning4j.models.sequencevectors.transformers.impl.GraphTransformer$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.transformers.impl.GraphTransformer$Builder [^GraphTransformer$Builder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache]
    (-> this (.setVocabCache vocab-cache))))

(defn shuffle-on-reset
  "really-shuffle - `boolean`

  returns: `org.deeplearning4j.models.sequencevectors.transformers.impl.GraphTransformer$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.transformers.impl.GraphTransformer$Builder [^GraphTransformer$Builder this ^Boolean really-shuffle]
    (-> this (.shuffleOnReset really-shuffle))))

(defn build
  "returns: `org.deeplearning4j.models.sequencevectors.transformers.impl.GraphTransformer<T>`"
  (^org.deeplearning4j.models.sequencevectors.transformers.impl.GraphTransformer [^GraphTransformer$Builder this]
    (-> this (.build))))

