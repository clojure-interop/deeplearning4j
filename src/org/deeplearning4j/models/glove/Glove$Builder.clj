(ns org.deeplearning4j.models.glove.Glove$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.glove Glove$Builder]))

(defn ->builder
  "Constructor.

  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  (^Glove$Builder [^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (new Glove$Builder configuration))
  (^Glove$Builder []
    (new Glove$Builder )))

(defn learning-rate
  "Description copied from class: SequenceVectors.Builder

  learning-rate - `double`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Double learning-rate]
    (-> this (.learningRate learning-rate))))

(defn use-ada-grad
  "Description copied from class: SequenceVectors.Builder

  really-use - `boolean`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Boolean really-use]
    (-> this (.useAdaGrad really-use))))

(defn window-size
  "Description copied from class: SequenceVectors.Builder

  window-size - `int`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Integer window-size]
    (-> this (.windowSize window-size))))

(defn lookup-table
  "Description copied from class: SequenceVectors.Builder

  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table]
    (-> this (.lookupTable lookup-table))))

(defn symmetric
  "Parameters specifying, if cooccurrences list should be build into both directions from any current word.

  really-symmetric - `boolean`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Boolean really-symmetric]
    (-> this (.symmetric really-symmetric))))

(defn min-learning-rate
  "Description copied from class: SequenceVectors.Builder

  min-learning-rate - `double`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Double min-learning-rate]
    (-> this (.minLearningRate min-learning-rate))))

(defn use-existing-word-vectors
  "This method has no effect for GloVe

  vec - existing WordVectors model - `org.deeplearning4j.models.embeddings.wordvectors.WordVectors`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^org.deeplearning4j.models.embeddings.wordvectors.WordVectors vec]
    (-> this (.useExistingWordVectors vec))))

(defn max-memory
  "This method allows you to specify maximum memory available for CoOccurrence map builder.
  Please note: this option can be considered a debugging method. In most cases setting proper -Xmx argument set to JVM is enough to limit this algorithm.
  Please note: this option won't override -Xmx JVM value.

  gbytes - memory limit, in gigabytes - `int`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Integer gbytes]
    (-> this (.maxMemory gbytes))))

(defn batch-size
  "Specifies minibatch size for training process.

  batch-size - `int`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Integer batch-size]
    (-> this (.batchSize batch-size))))

(defn use-unknown
  "This method allows you to specify, if UNK word should be used internally

  really-use - `boolean`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Boolean really-use]
    (-> this (.useUnknown really-use))))

(defn train-elements-representation
  "train-elements - `boolean`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Boolean train-elements]
    (-> this (.trainElementsRepresentation train-elements))))

(defn iterate
  "Description copied from class: SequenceVectors.Builder

  iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (-> this (.iterate iterator))))

(defn shuffle
  "Parameter specifying, if cooccurrences list should be shuffled between training epochs

  really-shuffle - `boolean`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Boolean really-shuffle]
    (-> this (.shuffle really-shuffle))))

(defn iterations
  "Ierations and epochs are the same in GloVe implementation.

  iterations - `int`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Integer iterations]
    (-> this (.iterations iterations))))

(defn stop-words
  "Description copied from class: SequenceVectors.Builder

  stop-list - `java.util.List`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^java.util.List stop-list]
    (-> this (.stopWords stop-list))))

(defn vocab-cache
  "Description copied from class: SequenceVectors.Builder

  vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache]
    (-> this (.vocabCache vocab-cache))))

(defn tokenizer-factory
  "Sets TokenizerFactory to be used for training

  tokenizer-factory - `org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory tokenizer-factory]
    (-> this (.tokenizerFactory tokenizer-factory))))

(defn seed
  "Description copied from class: SequenceVectors.Builder

  random-seed - `long`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Long random-seed]
    (-> this (.seed random-seed))))

(defn sampling
  "Deprecated.

  sampling - `double`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Double sampling]
    (-> this (.sampling sampling))))

(defn build
  "Description copied from class: SequenceVectors.Builder

  returns: `org.deeplearning4j.models.glove.Glove`"
  (^org.deeplearning4j.models.glove.Glove [^Glove$Builder this]
    (-> this (.build))))

(defn negative-sample
  "Deprecated.

  negative - `double`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Double negative]
    (-> this (.negativeSample negative))))

(defn unknown-element
  "This method allows you to specify SequenceElement that will be used as UNK element, if UNK is used

  element - `org.deeplearning4j.models.word2vec.VocabWord`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^org.deeplearning4j.models.word2vec.VocabWord element]
    (-> this (.unknownElement element))))

(defn x-max
  "Parameter specifying cutoff in weighting function; default 100.0

  x-max - `double`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Double x-max]
    (-> this (.xMax x-max))))

(defn reset-model
  "Description copied from class: SequenceVectors.Builder

  really-reset - `boolean`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Boolean really-reset]
    (-> this (.resetModel really-reset))))

(defn min-word-frequency
  "Sets minimum word frequency during vocabulary mastering.
  Please note: this option is ignored, if vocabulary is built outside of GloVe

  min-word-frequency - `int`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Integer min-word-frequency]
    (-> this (.minWordFrequency min-word-frequency))))

(defn alpha
  "Parameter in exponent of weighting function; default 0.75

  alpha - `double`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Double alpha]
    (-> this (.alpha alpha))))

(defn model-utils
  "Sets ModelUtils that gonna be used as provider for utility methods: similarity(), wordsNearest(), accuracy(), etc

  model-utils - model utils to be used - `org.deeplearning4j.models.embeddings.reader.ModelUtils`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^org.deeplearning4j.models.embeddings.reader.ModelUtils model-utils]
    (-> this (.modelUtils model-utils))))

(defn train-sequences-representation
  "Deprecated.

  train-sequences - `boolean`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Boolean train-sequences]
    (-> this (.trainSequencesRepresentation train-sequences))))

(defn set-vectors-listeners
  "This method sets VectorsListeners for this SequenceVectors model

  vectors-listeners - `java.util.Collection`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^java.util.Collection vectors-listeners]
    (-> this (.setVectorsListeners vectors-listeners))))

(defn layer-size
  "Description copied from class: SequenceVectors.Builder

  layer-size - `int`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Integer layer-size]
    (-> this (.layerSize layer-size))))

(defn use-variable-window
  "This method has no effect for ParagraphVectors

  windows - `int`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Integer windows]
    (-> this (.useVariableWindow windows))))

(defn workers
  "Description copied from class: SequenceVectors.Builder

  num-workers - `int`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Integer num-workers]
    (-> this (.workers num-workers))))

(defn epochs
  "Sets the number of iteration over training corpus during training

  num-epochs - `int`

  returns: `org.deeplearning4j.models.glove.Glove$Builder`"
  (^org.deeplearning4j.models.glove.Glove$Builder [^Glove$Builder this ^Integer num-epochs]
    (-> this (.epochs num-epochs))))

