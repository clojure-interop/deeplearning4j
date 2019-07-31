(ns org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.ocnn OCNNOutputLayer$Builder]))

(defn ->builder
  "Constructor."
  (^OCNNOutputLayer$Builder []
    (new OCNNOutputLayer$Builder )))

(defn configure-r
  "Whether to use the specified
  initialRValue or
  use the weight initialization with
  the neural network for the r value

  configure-r - true if we should use theinitial initialRValue - `boolean`

  returns: `org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder [^OCNNOutputLayer$Builder this ^Boolean configure-r]
    (-> this (.configureR configure-r))))

(defn initial-r-value
  "The initial r value to use for ocnn
  for definition, see the paper,
  note this is only active when configureR
  is specified as true

  initial-r-value - the int - `double`

  returns: `org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder [^OCNNOutputLayer$Builder this ^Double initial-r-value]
    (-> this (.initialRValue initial-r-value))))

(defn window-size
  "The number of examples to use for computing the
  quantile for the r value update.
  This value should generally be the same
  as the number of examples in the dataset

  window-size - the number of examples to usefor computing the quantileof the dataset for the r value update - `int`

  returns: `org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder [^OCNNOutputLayer$Builder this ^Integer window-size]
    (-> this (.windowSize window-size))))

(defn nu
  "For nu definition see the paper

  nu - the nu for ocnn - `double`

  returns: `org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder [^OCNNOutputLayer$Builder this ^Double nu]
    (-> this (.nu nu))))

(defn activation
  "The activation function to use with ocnn

  activation - the activation function to sue - `org.nd4j.linalg.activations.IActivation`

  returns: `org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder [^OCNNOutputLayer$Builder this ^org.nd4j.linalg.activations.IActivation activation]
    (-> this (.activation activation))))

(defn hidden-layer-size
  "The hidden layer size for the one class neural network.
  Note this would be nOut on a dense layer.
  NOut in this neural net is always set to 1 though.

  hidden-layer-size - the hidden layer size to usewith ocnn - `int`

  returns: `org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder [^OCNNOutputLayer$Builder this ^Integer hidden-layer-size]
    (-> this (.hiddenLayerSize hidden-layer-size))))

(defn n-out
  "Description copied from class: FeedForwardLayer.Builder

  n-out - Number of outputs / layer size - `int`

  returns: `org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder [^OCNNOutputLayer$Builder this ^Integer n-out]
    (-> this (.nOut n-out))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer`"
  (^org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer [^OCNNOutputLayer$Builder this]
    (-> this (.build))))

