(ns org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec Word2Vec$Builder]))

(defn ->builder
  "Constructor.

  Uses VectorsConfiguration bean to initialize Word2Vec model parameters

  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  (^Word2Vec$Builder [^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (new Word2Vec$Builder configuration))
  (^Word2Vec$Builder []
    (new Word2Vec$Builder )))

(defn learning-rate
  "This method specifies initial learning rate for model

  lr - `double`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Double lr]
    (-> this (.learningRate lr))))

(defn use-ada-grad
  "This method specifies, if adaptive gradients should be used during model training

  really-use - `boolean`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Boolean really-use]
    (-> this (.useAdaGrad really-use))))

(defn window-size
  "Specifies window size

  window-size - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer window-size]
    (-> this (.windowSize window-size))))

(defn min-learning-rate
  "This method specifies bottom threshold for learning rate decay

  mlr - `double`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Double mlr]
    (-> this (.minLearningRate mlr))))

(defn set-n-grams
  "Specifies N of n-Grams :)

  n-grams - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer n-grams]
    (-> this (.setNGrams n-grams))))

(defn batch-size
  "Specifies the size of mini-batch, used in single iteration during training

  batch-size - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer batch-size]
    (-> this (.batchSize batch-size))))

(defn use-unknown
  "Specifies, if UNK word should be used instead of words that are absent in vocab

  really-use - `boolean`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Boolean really-use]
    (-> this (.useUnknown really-use))))

(defn negative
  "Specifies negative sampling

  negative - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer negative]
    (-> this (.negative negative))))

(defn token-preprocessor
  "Specifies TokenPreProcessor class to be used during tokenization

  token-preprocessor - class name for tokenPreProcessor - `java.lang.String`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^java.lang.String token-preprocessor]
    (-> this (.tokenPreprocessor token-preprocessor))))

(defn iterations
  "This method specifies number of iterations over batch on each node

  num-iterations - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer num-iterations]
    (-> this (.iterations num-iterations))))

(defn stop-words
  "This method defines list of stop-words, that are to be ignored during vocab building and training

  stop-words - `java.util.List`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^java.util.List stop-words]
    (-> this (.stopWords stop-words))))

(defn tokenizer-factory
  "Specifies TokenizerFactory to be used for tokenization
  PLEASE NOTE: You can't use anonymous implementation here

  factory - `org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory factory]
    (-> this (.tokenizerFactory factory))))

(defn seed
  "Specifies random seed to be used during weights initialization;

  seed - `long`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Long seed]
    (-> this (.seed seed))))

(defn sampling
  "Specifies subsamplng value

  sampling - `double`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Double sampling]
    (-> this (.sampling sampling))))

(defn build
  "returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec [^Word2Vec$Builder this]
    (-> this (.build))))

(defn min-word-frequency
  "This method specifies minimum word frequency threshold. All words below this threshold will be ignored.

  min-word-frequency - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer min-word-frequency]
    (-> this (.minWordFrequency min-word-frequency))))

(defn layer-size
  "Specifies output vector's dimensions

  layer-size - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer layer-size]
    (-> this (.layerSize layer-size))))

(defn workers
  "Specify number of workers for training process.
  This value will be used to repartition RDD.
  PLEASE NOTE: Recommended value is number of vCPU available within your spark cluster.

  workers - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer workers]
    (-> this (.workers workers))))

(defn epochs
  "This method specifies number of epochs done over whole corpus
  PLEASE NOTE: NOT IMPLEMENTED

  num-epochs - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder [^Word2Vec$Builder this ^Integer num-epochs]
    (-> this (.epochs num-epochs))))

