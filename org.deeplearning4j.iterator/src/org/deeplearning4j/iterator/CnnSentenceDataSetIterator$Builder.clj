(ns org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.iterator CnnSentenceDataSetIterator$Builder]))

(defn ->builder
  "Constructor.

  format - The format to use for the features - i.e., for 1D or 2D CNNs - `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Format`"
  (^CnnSentenceDataSetIterator$Builder [^org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Format format]
    (new CnnSentenceDataSetIterator$Builder format))
  (^CnnSentenceDataSetIterator$Builder []
    (new CnnSentenceDataSetIterator$Builder )))

(defn sentence-provider
  "Specify how the (labelled) sentences / documents should be provided

  iterator - `org.deeplearning4j.text.documentiterator.LabelAwareIterator`
  labels - `java.util.List`

  returns: `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder`"
  (^org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder [^CnnSentenceDataSetIterator$Builder this ^org.deeplearning4j.text.documentiterator.LabelAwareIterator iterator ^java.util.List labels]
    (-> this (.sentenceProvider iterator labels)))
  (^org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder [^CnnSentenceDataSetIterator$Builder this ^org.deeplearning4j.iterator.LabeledSentenceProvider labeled-sentence-provider]
    (-> this (.sentenceProvider labeled-sentence-provider))))

(defn word-vectors
  "Provide the WordVectors instance that should be used for training

  word-vectors - `org.deeplearning4j.models.embeddings.wordvectors.WordVectors`

  returns: `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder`"
  (^org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder [^CnnSentenceDataSetIterator$Builder this ^org.deeplearning4j.models.embeddings.wordvectors.WordVectors word-vectors]
    (-> this (.wordVectors word-vectors))))

(defn use-normalized-word-vectors
  "Whether normalized word vectors should be used. Default: true

  use-normalized-word-vectors - `boolean`

  returns: `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder`"
  (^org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder [^CnnSentenceDataSetIterator$Builder this ^Boolean use-normalized-word-vectors]
    (-> this (.useNormalizedWordVectors use-normalized-word-vectors))))

(defn minibatch-size
  "Minibatch size to use for the DataSetIterator

  minibatch-size - `int`

  returns: `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder`"
  (^org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder [^CnnSentenceDataSetIterator$Builder this ^Integer minibatch-size]
    (-> this (.minibatchSize minibatch-size))))

(defn data-set-pre-processor
  "Optional DataSetPreProcessor

  data-set-pre-processor - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`

  returns: `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder`"
  (^org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder [^CnnSentenceDataSetIterator$Builder this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor data-set-pre-processor]
    (-> this (.dataSetPreProcessor data-set-pre-processor))))

(defn tokenizer-factory
  "The TokenizerFactory that should be used. Defaults to DefaultTokenizerFactory

  tokenizer-factory - `org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory`

  returns: `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder`"
  (^org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder [^CnnSentenceDataSetIterator$Builder this ^org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory tokenizer-factory]
    (-> this (.tokenizerFactory tokenizer-factory))))

(defn unknown-word-handling
  "Specify how unknown words (those that don't have a word vector in the provided WordVectors instance) should be
  handled. Default: remove/ignore unknown words.

  unknown-word-handling - `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$UnknownWordHandling`

  returns: `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder`"
  (^org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder [^CnnSentenceDataSetIterator$Builder this ^org.deeplearning4j.iterator.CnnSentenceDataSetIterator$UnknownWordHandling unknown-word-handling]
    (-> this (.unknownWordHandling unknown-word-handling))))

(defn build
  "returns: `org.deeplearning4j.iterator.CnnSentenceDataSetIterator`"
  (^org.deeplearning4j.iterator.CnnSentenceDataSetIterator [^CnnSentenceDataSetIterator$Builder this]
    (-> this (.build))))

(defn sentences-along-height
  "If true (default): output features data with shape [minibatchSize, 1, maxSentenceLength, wordVectorSize]
  If false: output features with shape [minibatchSize, 1, wordVectorSize, maxSentenceLength]

  sentences-along-height - `boolean`

  returns: `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder`"
  (^org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder [^CnnSentenceDataSetIterator$Builder this ^Boolean sentences-along-height]
    (-> this (.sentencesAlongHeight sentences-along-height))))

(defn max-sentence-length
  "Maximum sentence/document length. If sentences exceed this, they will be truncated to this length by
  taking the first 'maxSentenceLength' known words.

  max-sentence-length - `int`

  returns: `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder`"
  (^org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Builder [^CnnSentenceDataSetIterator$Builder this ^Integer max-sentence-length]
    (-> this (.maxSentenceLength max-sentence-length))))

