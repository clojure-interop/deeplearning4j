(ns org.deeplearning4j.nn.conf.layers.SeparableConvolution2D$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers SeparableConvolution2D$Builder]))

(defn ->builder
  "Constructor.

  kernel-size - `int[]`
  stride - `int[]`
  padding - `int[]`"
  (^SeparableConvolution2D$Builder [kernel-size stride padding]
    (new SeparableConvolution2D$Builder kernel-size stride padding))
  (^SeparableConvolution2D$Builder [kernel-size stride]
    (new SeparableConvolution2D$Builder kernel-size stride))
  (^SeparableConvolution2D$Builder [^Integer kernel-size]
    (new SeparableConvolution2D$Builder kernel-size))
  (^SeparableConvolution2D$Builder []
    (new SeparableConvolution2D$Builder )))

(defn depth-multiplier
  "Instance Field.

  type: int"
  (^Integer [^SeparableConvolution2D$Builder this]
    (-> this .-depthMultiplier)))

(defn depth-multiplier
  "Set channels multiplier of channels-wise step in separable convolution

  depth-multiplier - integer value, for each input map we get depthMultipleroutputs in channels-wise step. - `int`

  returns: Builder - `org.deeplearning4j.nn.conf.layers.SeparableConvolution2D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.SeparableConvolution2D$Builder [^SeparableConvolution2D$Builder this ^Integer depth-multiplier]
    (-> this (.depthMultiplier depth-multiplier))))

(defn constrain-point-wise
  "Set constraints to be applied to the point-wise convolution weight parameters of this layer.
  Default: no constraints.
  Constraints can be used to enforce certain conditions (non-negativity of parameters, max-norm regularization,
  etc). These constraints are applied at each iteration, after the parameters have been updated.

  constraints - Constraints to apply to the point-wise convolution parameters of this layer - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `org.deeplearning4j.nn.conf.layers.SeparableConvolution2D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.SeparableConvolution2D$Builder [^SeparableConvolution2D$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainPointWise constraints))))

(defn kernel-size
  "Size of the convolution
  rows/columns

  kernel-size - the height and width of thekernel - `int`

  returns: `org.deeplearning4j.nn.conf.layers.SeparableConvolution2D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.SeparableConvolution2D$Builder [^SeparableConvolution2D$Builder this ^Integer kernel-size]
    (-> this (.kernelSize kernel-size))))

(defn stride
  "stride - `int`

  returns: `org.deeplearning4j.nn.conf.layers.SeparableConvolution2D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.SeparableConvolution2D$Builder [^SeparableConvolution2D$Builder this ^Integer stride]
    (-> this (.stride stride))))

(defn padding
  "padding - `int`

  returns: `org.deeplearning4j.nn.conf.layers.SeparableConvolution2D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.SeparableConvolution2D$Builder [^SeparableConvolution2D$Builder this ^Integer padding]
    (-> this (.padding padding))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.SeparableConvolution2D`"
  (^org.deeplearning4j.nn.conf.layers.SeparableConvolution2D [^SeparableConvolution2D$Builder this]
    (-> this (.build))))

