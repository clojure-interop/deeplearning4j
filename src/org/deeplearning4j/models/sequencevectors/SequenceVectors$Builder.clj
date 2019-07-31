(ns org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors SequenceVectors$Builder]))

(defn ->builder
  "Constructor.

  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  (^SequenceVectors$Builder [^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (new SequenceVectors$Builder configuration))
  (^SequenceVectors$Builder []
    (new SequenceVectors$Builder )))

(defn learning-rate
  "This method defines initial learning rate.
  Default value is 0.025

  learning-rate - `double`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Double learning-rate]
    (-> this (.learningRate learning-rate))))

(defn use-ada-grad
  "Deprecated.

  really-use - `boolean`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Boolean really-use]
    (-> this (.useAdaGrad really-use))))

(defn window-size
  "Sets window size for skip-Gram training

  window-size - `int`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Integer window-size]
    (-> this (.windowSize window-size))))

(defn lookup-table
  "You can pass externally built WeightLookupTable, containing model weights and vocabulary.

  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table]
    (-> this (.lookupTable lookup-table))))

(defn min-learning-rate
  "This method defines minimum learning rate after decay being applied.
  Default value is 0.01

  min-learning-rate - `double`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Double min-learning-rate]
    (-> this (.minLearningRate min-learning-rate))))

(defn limit-vocabulary-size
  "This method sets vocabulary limit during construction.
  Default value: 0. Means no limit

  limit - `int`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Integer limit]
    (-> this (.limitVocabularySize limit))))

(defn batch-size
  "This method defines batchSize option, viable only if iterations > 1

  batch-size - `int`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Integer batch-size]
    (-> this (.batchSize batch-size))))

(defn use-unknown
  "This method allows you to specify, if UNK word should be used internally

  really-use - `boolean`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Boolean really-use]
    (-> this (.useUnknown really-use))))

(defn train-elements-representation
  "train-elements - `boolean`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Boolean train-elements]
    (-> this (.trainElementsRepresentation train-elements))))

(defn sequence-learning-algorithm
  "Sets specific LearningAlgorithm as Sequence Learning Algorithm

  algo-name - fully qualified class name - `java.lang.String`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^java.lang.String algo-name]
    (-> this (.sequenceLearningAlgorithm algo-name))))

(defn iterate
  "This method defines SequenceIterator to be used for model building

  iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (-> this (.iterate iterator))))

(defn use-hierarchic-softmax
  "Enable/disable hierarchic softmax

  really-use - `boolean`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Boolean really-use]
    (-> this (.useHierarchicSoftmax really-use))))

(defn iterations
  "This method defines how much iterations should be done over batched sequences.

  iterations - `int`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Integer iterations]
    (-> this (.iterations iterations))))

(defn stop-words
  "You can provide collection of objects to be ignored, and excluded out of model
  Please note: Object labels and hashCode will be used for filtering

  stop-list - `java.util.List`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^java.util.List stop-list]
    (-> this (.stopWords stop-list))))

(defn vocab-cache
  "You can pass externally built vocabCache object, containing vocabulary

  vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache]
    (-> this (.vocabCache vocab-cache))))

(defn use-precise-weight-init
  "If set to true, initial weights for elements/sequences will be derived from elements themself.
  However, this implies additional cycle through input iterator.
  Default value: FALSE

  really-use - `boolean`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Boolean really-use]
    (-> this (.usePreciseWeightInit really-use))))

(defn seed
  "Sets seed for random numbers generator.
  Please note: this has effect only if vocabulary and WeightLookupTable is built internally

  random-seed - `long`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Long random-seed]
    (-> this (.seed random-seed))))

(defn sampling
  "This method defines sub-sampling threshold.

  sampling - `double`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Double sampling]
    (-> this (.sampling sampling))))

(defn build
  "Build SequenceVectors instance with defined settings/options

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors [^SequenceVectors$Builder this]
    (-> this (.build))))

(defn elements-learning-algorithm
  "* Sets specific LearningAlgorithm as Elements Learning Algorithm

  algo-name - fully qualified class name - `java.lang.String`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^java.lang.String algo-name]
    (-> this (.elementsLearningAlgorithm algo-name))))

(defn negative-sample
  "This method defines negative sampling value for skip-gram algorithm.

  negative - `double`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Double negative]
    (-> this (.negativeSample negative))))

(defn unknown-element
  "This method allows you to specify SequenceElement that will be used as UNK element, if UNK is used

  element - `T`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this element]
    (-> this (.unknownElement element))))

(defn reset-model
  "This method defines, should all model be reset before training. If set to true, vocabulary and WeightLookupTable will be reset before training, and will be built from scratches

  really-reset - `boolean`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Boolean really-reset]
    (-> this (.resetModel really-reset))))

(defn min-word-frequency
  "This method defines minimal element frequency for elements found in the training corpus. All elements with frequency below this threshold will be removed before training.
  Please note: this method has effect only if vocabulary is built internally.

  min-word-frequency - `int`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Integer min-word-frequency]
    (-> this (.minWordFrequency min-word-frequency))))

(defn model-utils
  "ModelUtils implementation, that will be used to access model.
  Methods like: similarity, wordsNearest, accuracy are provided by user-defined ModelUtils

  model-utils - model utils to be used - `org.deeplearning4j.models.embeddings.reader.ModelUtils`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^org.deeplearning4j.models.embeddings.reader.ModelUtils model-utils]
    (-> this (.modelUtils model-utils))))

(defn train-sequences-representation
  "train-sequences - `boolean`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Boolean train-sequences]
    (-> this (.trainSequencesRepresentation train-sequences))))

(defn enable-scavenger
  "This method ebables/disables periodical vocab truncation during construction
  Default value: disabled

  really-enable - `boolean`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Boolean really-enable]
    (-> this (.enableScavenger really-enable))))

(defn set-vectors-listeners
  "This method sets VectorsListeners for this SequenceVectors model

  listeners - `java.util.Collection`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^java.util.Collection listeners]
    (-> this (.setVectorsListeners listeners))))

(defn layer-size
  "This method defines number of dimensions for outcome vectors.
  Please note: This option has effect only if lookupTable wasn't defined during building process.

  layer-size - `int`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Integer layer-size]
    (-> this (.layerSize layer-size))))

(defn use-variable-window
  "This method allows to use variable window size. In this case, every batch gets processed using one of predefined window sizes

  windows - `int`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Integer windows]
    (-> this (.useVariableWindow windows))))

(defn workers
  "Sets number of worker threads to be used in calculations

  num-workers - `int`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Integer num-workers]
    (-> this (.workers num-workers))))

(defn epochs
  "This method defines how much iterations should be done over whole training corpus during modelling

  num-epochs - `int`

  returns: `org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.SequenceVectors$Builder [^SequenceVectors$Builder this ^Integer num-epochs]
    (-> this (.epochs num-epochs))))

