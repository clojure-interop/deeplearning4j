(ns org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers VariationalAutoencoderLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^VariationalAutoencoderLayerSpace$Builder []
    (new VariationalAutoencoderLayerSpace$Builder )))

(defn encoder-layer-sizes
  "encoder-layer-sizes - `int`

  returns: `org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder [^VariationalAutoencoderLayerSpace$Builder this ^Integer encoder-layer-sizes]
    (-> this (.encoderLayerSizes encoder-layer-sizes))))

(defn decoder-layer-sizes
  "decoder-layer-sizes - `int`

  returns: `org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder [^VariationalAutoencoderLayerSpace$Builder this ^Integer decoder-layer-sizes]
    (-> this (.decoderLayerSizes decoder-layer-sizes))))

(defn reconstruction-distribution
  "distribution - `org.deeplearning4j.nn.conf.layers.variational.ReconstructionDistribution`

  returns: `org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder [^VariationalAutoencoderLayerSpace$Builder this ^org.deeplearning4j.nn.conf.layers.variational.ReconstructionDistribution distribution]
    (-> this (.reconstructionDistribution distribution))))

(defn loss-function
  "output-activation-fn - `org.nd4j.linalg.activations.IActivation`
  loss-function - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`

  returns: `org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder [^VariationalAutoencoderLayerSpace$Builder this ^org.nd4j.linalg.activations.IActivation output-activation-fn ^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction loss-function]
    (-> this (.lossFunction output-activation-fn loss-function))))

(defn pzx-activation-fn
  "activation-function - `org.nd4j.linalg.activations.IActivation`

  returns: `org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder [^VariationalAutoencoderLayerSpace$Builder this ^org.nd4j.linalg.activations.IActivation activation-function]
    (-> this (.pzxActivationFn activation-function))))

(defn pzx-activation-function
  "activation - `org.nd4j.linalg.activations.Activation`

  returns: `org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder [^VariationalAutoencoderLayerSpace$Builder this ^org.nd4j.linalg.activations.Activation activation]
    (-> this (.pzxActivationFunction activation))))

(defn num-samples
  "num-samples - `int`

  returns: `org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.VariationalAutoencoderLayerSpace$Builder [^VariationalAutoencoderLayerSpace$Builder this ^Integer num-samples]
    (-> this (.numSamples num-samples))))

(defn build
  "returns: `<E extends org.deeplearning4j.arbiter.layers.LayerSpace> E`"
  ([^VariationalAutoencoderLayerSpace$Builder this]
    (-> this (.build))))

