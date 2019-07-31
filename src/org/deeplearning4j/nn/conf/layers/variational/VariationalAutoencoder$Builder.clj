(ns org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.variational VariationalAutoencoder$Builder]))

(defn ->builder
  "Constructor."
  (^VariationalAutoencoder$Builder []
    (new VariationalAutoencoder$Builder )))

(defn encoder-layer-sizes
  "Size of the encoder layers, in units. Each encoder layer is functionally equivalent to a DenseLayer.
  Typically the number and size of the decoder layers (set via decoderLayerSizes(int...) is similar to the encoder layers.

  encoder-layer-sizes - Size of each encoder layer in the variational autoencoder - `int`

  returns: `org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder`"
  (^org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder [^VariationalAutoencoder$Builder this ^Integer encoder-layer-sizes]
    (-> this (.encoderLayerSizes encoder-layer-sizes))))

(defn reconstruction-distribution
  "The reconstruction distribution for the data given the hidden state - i.e., P(data|Z).
  This should be selected carefully based on the type of data being modelled. For example:
  - GaussianReconstructionDistribution  {identity or tanh} for real-valued (Gaussian) data
  - BernoulliReconstructionDistribution  sigmoid for binary-valued (0 or 1) data

  distribution - Reconstruction distribution - `org.deeplearning4j.nn.conf.layers.variational.ReconstructionDistribution`

  returns: `org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder`"
  (^org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder [^VariationalAutoencoder$Builder this ^org.deeplearning4j.nn.conf.layers.variational.ReconstructionDistribution distribution]
    (-> this (.reconstructionDistribution distribution))))

(defn decoder-layer-sizes
  "Size of the decoder layers, in units. Each decoder layer is functionally equivalent to a DenseLayer.
  Typically the number and size of the decoder layers is similar to the encoder layers (set via encoderLayerSizes(int...).

  decoder-layer-sizes - Size of each deccoder layer in the variational autoencoder - `int`

  returns: `org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder`"
  (^org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder [^VariationalAutoencoder$Builder this ^Integer decoder-layer-sizes]
    (-> this (.decoderLayerSizes decoder-layer-sizes))))

(defn n-out
  "Set the size of the VAE state Z. This is the output size during standard forward pass, and the size of the
  distribution P(Z|data) during pretraining.

  n-out - Size of P(Z|data) and output size - `int`

  returns: `org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder`"
  (^org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder [^VariationalAutoencoder$Builder this ^Integer n-out]
    (-> this (.nOut n-out))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder`"
  (^org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder [^VariationalAutoencoder$Builder this]
    (-> this (.build))))

(defn num-samples
  "Set the number of samples per data point (from VAE state Z) used when doing pretraining. Default value: 1.

  This is parameter L from Kingma and Welling: \"In our experiments we found that the number of samples L per
  datapoint can be set to 1 as long as the minibatch size M was large enough, e.g. M = 100.\"

  num-samples - Number of samples per data point for pretraining - `int`

  returns: `org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder`"
  (^org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder [^VariationalAutoencoder$Builder this ^Integer num-samples]
    (-> this (.numSamples num-samples))))

(defn pzx-activation-fn
  "Activation function for the input to P(z|data).
  Care should be taken with this, as some activation functions (relu, etc) are not suitable due to being
  bounded in range [0,infinity).

  activation-function - Activation function for p(z|x) - `org.nd4j.linalg.activations.IActivation`

  returns: `org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder`"
  (^org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder [^VariationalAutoencoder$Builder this ^org.nd4j.linalg.activations.IActivation activation-function]
    (-> this (.pzxActivationFn activation-function))))

(defn pzx-activation-function
  "Activation function for the input to P(z|data).
  Care should be taken with this, as some activation functions (relu, etc) are not suitable due to being
  bounded in range [0,infinity).

  activation - Activation function for p(z|x) - `org.nd4j.linalg.activations.Activation`

  returns: `org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder`"
  (^org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder [^VariationalAutoencoder$Builder this ^org.nd4j.linalg.activations.Activation activation]
    (-> this (.pzxActivationFunction activation))))

(defn loss-function
  "Configure the VAE to use the specified loss function for the reconstruction, instead of a ReconstructionDistribution.
  Note that this is NOT following the standard VAE design (as per Kingma & Welling), which assumes a probabilistic
  output - i.e., some p(x|z). It is however a valid network configuration, allowing for optimization of more traditional
  objectives such as mean squared error.
  Note: clearly, setting the loss function here will override any previously set recontruction distribution

  output-activation-fn - Activation function for the output/reconstruction - `org.nd4j.linalg.activations.IActivation`
  loss-function - Loss function to use - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`

  returns: `org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder`"
  (^org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder$Builder [^VariationalAutoencoder$Builder this ^org.nd4j.linalg.activations.IActivation output-activation-fn ^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction loss-function]
    (-> this (.lossFunction output-activation-fn loss-function))))

