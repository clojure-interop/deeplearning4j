(ns org.deeplearning4j.models.node2vec.Node2Vec$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.node2vec Node2Vec$Builder]))

(defn ->builder
  "Constructor.

  walker - `org.deeplearning4j.models.sequencevectors.graph.walkers.GraphWalker`
  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  (^Node2Vec$Builder [^org.deeplearning4j.models.sequencevectors.graph.walkers.GraphWalker walker ^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (new Node2Vec$Builder walker configuration)))

(defn learning-rate
  "Description copied from class: SequenceVectors.Builder

  learning-rate - `double`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Double learning-rate]
    (-> this (.learningRate learning-rate))))

(defn use-ada-grad
  "Description copied from class: SequenceVectors.Builder

  really-use - `boolean`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Boolean really-use]
    (-> this (.useAdaGrad really-use))))

(defn window-size
  "Description copied from class: SequenceVectors.Builder

  window-size - `int`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Integer window-size]
    (-> this (.windowSize window-size))))

(defn lookup-table
  "Description copied from class: SequenceVectors.Builder

  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table]
    (-> this (.lookupTable lookup-table))))

(defn min-learning-rate
  "Description copied from class: SequenceVectors.Builder

  min-learning-rate - `double`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Double min-learning-rate]
    (-> this (.minLearningRate min-learning-rate))))

(defn use-unknown
  "Description copied from class: SequenceVectors.Builder

  really-use - `boolean`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Boolean really-use]
    (-> this (.useUnknown really-use))))

(defn train-elements-representation
  "train-elements - `boolean`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Boolean train-elements]
    (-> this (.trainElementsRepresentation train-elements))))

(defn sequence-learning-algorithm
  "Description copied from class: SequenceVectors.Builder

  algo-name - fully qualified class name - `java.lang.String`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^java.lang.String algo-name]
    (-> this (.sequenceLearningAlgorithm algo-name))))

(defn iterate
  "Description copied from class: SequenceVectors.Builder

  iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (-> this (.iterate iterator))))

(defn use-hierarchic-softmax
  "Description copied from class: SequenceVectors.Builder

  really-use - `boolean`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Boolean really-use]
    (-> this (.useHierarchicSoftmax really-use))))

(defn iterations
  "Description copied from class: SequenceVectors.Builder

  iterations - `int`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Integer iterations]
    (-> this (.iterations iterations))))

(defn stop-words
  "Description copied from class: SequenceVectors.Builder

  stop-list - `java.util.List`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^java.util.List stop-list]
    (-> this (.stopWords stop-list))))

(defn vocab-cache
  "Description copied from class: SequenceVectors.Builder

  vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache]
    (-> this (.vocabCache vocab-cache))))

(defn use-precise-weight-init
  "Description copied from class: SequenceVectors.Builder

  really-use - `boolean`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Boolean really-use]
    (-> this (.usePreciseWeightInit really-use))))

(defn seed
  "Description copied from class: SequenceVectors.Builder

  random-seed - `long`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Long random-seed]
    (-> this (.seed random-seed))))

(defn sampling
  "Description copied from class: SequenceVectors.Builder

  sampling - `double`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Double sampling]
    (-> this (.sampling sampling))))

(defn build
  "Description copied from class: SequenceVectors.Builder

  returns: `org.deeplearning4j.models.node2vec.Node2Vec<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec [^Node2Vec$Builder this]
    (-> this (.build))))

(defn elements-learning-algorithm
  "Description copied from class: SequenceVectors.Builder

  algo-name - fully qualified class name - `java.lang.String`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^java.lang.String algo-name]
    (-> this (.elementsLearningAlgorithm algo-name))))

(defn negative-sample
  "Description copied from class: SequenceVectors.Builder

  negative - `double`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Double negative]
    (-> this (.negativeSample negative))))

(defn unknown-element
  "Description copied from class: SequenceVectors.Builder

  element - `V`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this element]
    (-> this (.unknownElement element))))

(defn reset-model
  "Description copied from class: SequenceVectors.Builder

  really-reset - `boolean`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Boolean really-reset]
    (-> this (.resetModel really-reset))))

(defn min-word-frequency
  "Description copied from class: SequenceVectors.Builder

  min-word-frequency - `int`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Integer min-word-frequency]
    (-> this (.minWordFrequency min-word-frequency))))

(defn model-utils
  "Description copied from class: SequenceVectors.Builder

  model-utils - model utils to be used - `org.deeplearning4j.models.embeddings.reader.ModelUtils`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^org.deeplearning4j.models.embeddings.reader.ModelUtils model-utils]
    (-> this (.modelUtils model-utils))))

(defn train-sequences-representation
  "train-sequences - `boolean`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Boolean train-sequences]
    (-> this (.trainSequencesRepresentation train-sequences))))

(defn enable-scavenger
  "Description copied from class: SequenceVectors.Builder

  really-enable - `boolean`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Boolean really-enable]
    (-> this (.enableScavenger really-enable))))

(defn set-vectors-listeners
  "Description copied from class: SequenceVectors.Builder

  vectors-listeners - `java.util.Collection`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^java.util.Collection vectors-listeners]
    (-> this (.setVectorsListeners vectors-listeners))))

(defn layer-size
  "Description copied from class: SequenceVectors.Builder

  layer-size - `int`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Integer layer-size]
    (-> this (.layerSize layer-size))))

(defn use-variable-window
  "Description copied from class: SequenceVectors.Builder

  windows - `int`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Integer windows]
    (-> this (.useVariableWindow windows))))

(defn workers
  "Description copied from class: SequenceVectors.Builder

  num-workers - `int`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Integer num-workers]
    (-> this (.workers num-workers))))

(defn epochs
  "Description copied from class: SequenceVectors.Builder

  num-epochs - `int`

  returns: `org.deeplearning4j.models.node2vec.Node2Vec$Builder<V,E>`"
  (^org.deeplearning4j.models.node2vec.Node2Vec$Builder [^Node2Vec$Builder this ^Integer num-epochs]
    (-> this (.epochs num-epochs))))

