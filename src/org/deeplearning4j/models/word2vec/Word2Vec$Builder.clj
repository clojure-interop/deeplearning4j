(ns org.deeplearning4j.models.word2vec.Word2Vec$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec Word2Vec$Builder]))

(defn ->builder
  "Constructor.

  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  (^Word2Vec$Builder [^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (new Word2Vec$Builder configuration))
  (^Word2Vec$Builder []
    (new Word2Vec$Builder )))

(defn learning-rate
  "This method defines initial learning rate for model training

  learning-rate - `double`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Double learning-rate]
    (-> this (.learningRate learning-rate))))

(defn use-ada-grad
  "This method defines whether adaptive gradients should be used or not

  really-use - `boolean`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Boolean really-use]
    (-> this (.useAdaGrad really-use))))

(defn window-size
  "This method defines context window size

  window-size - `int`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer window-size]
    (-> this (.windowSize window-size))))

(defn lookup-table
  "This method allows to define external WeightLookupTable to be used

  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table]
    (-> this (.lookupTable lookup-table))))

(defn min-learning-rate
  "This method defines minimal learning rate value for training

  min-learning-rate - `double`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Double min-learning-rate]
    (-> this (.minLearningRate min-learning-rate))))

(defn limit-vocabulary-size
  "This method sets vocabulary limit during construction.
  Default value: 0. Means no limit

  limit - `int`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer limit]
    (-> this (.limitVocabularySize limit))))

(defn batch-size
  "This method defines mini-batch size

  batch-size - `int`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer batch-size]
    (-> this (.batchSize batch-size))))

(defn use-unknown
  "This method allows you to specify, if UNK word should be used internally

  really-use - `boolean`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Boolean really-use]
    (-> this (.useUnknown really-use))))

(defn train-elements-representation
  "This method is hardcoded to TRUE, since that's whole point of Word2Vec

  train-elements - `boolean`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Boolean train-elements]
    (-> this (.trainElementsRepresentation train-elements))))

(defn iterate
  "This method used to feed SentenceIterator, that contains training corpus, into ParagraphVectors

  iterator - `org.deeplearning4j.text.sentenceiterator.SentenceIterator`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^org.deeplearning4j.text.sentenceiterator.SentenceIterator iterator]
    (-> this (.iterate iterator))))

(defn use-hierarchic-softmax
  "This method enables/disables Hierarchic softmax
  Default value: enabled

  really-use - `boolean`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Boolean really-use]
    (-> this (.useHierarchicSoftmax really-use))))

(defn iterations
  "This method defines number of iterations done for each mini-batch during training

  iterations - `int`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer iterations]
    (-> this (.iterations iterations))))

(defn allow-parallel-tokenization
  "This method enables/disables parallel tokenization.
  Default value: TRUE

  allow - `boolean`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Boolean allow]
    (-> this (.allowParallelTokenization allow))))

(defn stop-words
  "This method defines stop words that should be ignored during training

  stop-list - `java.util.List`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^java.util.List stop-list]
    (-> this (.stopWords stop-list))))

(defn vocab-cache
  "This method allows to define external VocabCache to be used

  vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache]
    (-> this (.vocabCache vocab-cache))))

(defn tokenizer-factory
  "This method defines TokenizerFactory to be used for strings tokenization during training
  PLEASE NOTE: If external VocabCache is used, the same TokenizerFactory should be used to keep derived tokens equal.

  tokenizer-factory - `org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory tokenizer-factory]
    (-> this (.tokenizerFactory tokenizer-factory))))

(defn use-precise-weight-init
  "Description copied from class: SequenceVectors.Builder

  really-use - `boolean`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Boolean really-use]
    (-> this (.usePreciseWeightInit really-use))))

(defn seed
  "This method defines random seed for random numbers generator

  random-seed - `long`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Long random-seed]
    (-> this (.seed random-seed))))

(defn sampling
  "This method defines whether subsampling should be used or not

  sampling - set > 0 to subsampling argument, or 0 to disable - `double`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Double sampling]
    (-> this (.sampling sampling))))

(defn build
  "Description copied from class: SequenceVectors.Builder

  returns: `org.deeplearning4j.models.word2vec.Word2Vec`"
  (^org.deeplearning4j.models.word2vec.Word2Vec [^Word2Vec$Builder this]
    (-> this (.build))))

(defn elements-learning-algorithm
  "Description copied from class: SequenceVectors.Builder

  algorithm - fully qualified class name - `java.lang.String`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^java.lang.String algorithm]
    (-> this (.elementsLearningAlgorithm algorithm))))

(defn negative-sample
  "This method defines whether negative sampling should be used or not
  PLEASE NOTE: If you're going to use negative sampling, you might want to disable HierarchicSoftmax, which is enabled by default
  Default value: 0

  negative - set > 0 as negative sampling argument, or 0 to disable - `double`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Double negative]
    (-> this (.negativeSample negative))))

(defn unknown-element
  "This method allows you to specify SequenceElement that will be used as UNK element, if UNK is used

  element - `org.deeplearning4j.models.word2vec.VocabWord`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^org.deeplearning4j.models.word2vec.VocabWord element]
    (-> this (.unknownElement element))))

(defn reset-model
  "This method defines whether model should be totally wiped out prior building, or not

  really-reset - `boolean`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Boolean really-reset]
    (-> this (.resetModel really-reset))))

(defn min-word-frequency
  "This method defines minimal word frequency in training corpus. All words below this threshold will be removed prior model training

  min-word-frequency - `int`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer min-word-frequency]
    (-> this (.minWordFrequency min-word-frequency))))

(defn model-utils
  "Sets ModelUtils that gonna be used as provider for utility methods: similarity(), wordsNearest(), accuracy(), etc

  model-utils - model utils to be used - `org.deeplearning4j.models.embeddings.reader.ModelUtils`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^org.deeplearning4j.models.embeddings.reader.ModelUtils model-utils]
    (-> this (.modelUtils model-utils))))

(defn train-sequences-representation
  "This method is hardcoded to FALSE, since that's whole point of Word2Vec

  train-sequences - `boolean`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Boolean train-sequences]
    (-> this (.trainSequencesRepresentation train-sequences))))

(defn enable-scavenger
  "This method ebables/disables periodical vocab truncation during construction
  Default value: disabled

  really-enable - `boolean`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Boolean really-enable]
    (-> this (.enableScavenger really-enable))))

(defn set-vectors-listeners
  "This method sets VectorsListeners for this SequenceVectors model

  vectors-listeners - `java.util.Collection`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^java.util.Collection vectors-listeners]
    (-> this (.setVectorsListeners vectors-listeners))))

(defn layer-size
  "This method defines number of dimensions for output vectors

  layer-size - `int`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer layer-size]
    (-> this (.layerSize layer-size))))

(defn use-variable-window
  "This method allows to use variable window size. In this case, every batch gets processed using one of predefined window sizes

  windows - `int`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer windows]
    (-> this (.useVariableWindow windows))))

(defn workers
  "This method defines maximum number of concurrent threads available for training

  num-workers - `int`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer num-workers]
    (-> this (.workers num-workers))))

(defn epochs
  "This method defines number of epochs (iterations over whole training corpus) for training

  num-epochs - `int`

  returns: `org.deeplearning4j.models.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.models.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer num-epochs]
    (-> this (.epochs num-epochs))))

