(ns org.deeplearning4j.nn.conf.layers.BaseRecurrentLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers BaseRecurrentLayer$Builder]))

(defn ->builder
  "Constructor."
  (^BaseRecurrentLayer$Builder []
    (new BaseRecurrentLayer$Builder )))

(defn constrain-recurrent
  "Set constraints to be applied to the RNN recurrent weight parameters of this layer. Default: no constraints.
  Constraints can be used to enforce certain conditions (non-negativity of parameters, max-norm regularization,
  etc). These constraints are applied at each iteration, after the parameters have been updated.

  constraints - Constraints to apply to the recurrent weight parameters of this layer - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `T`"
  ([^BaseRecurrentLayer$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainRecurrent constraints))))

(defn constrain-input-weights
  "Set constraints to be applied to the RNN input weight parameters of this layer. Default: no constraints.
  Constraints can be used to enforce certain conditions (non-negativity of parameters, max-norm regularization,
  etc). These constraints are applied at each iteration, after the parameters have been updated.

  constraints - Constraints to apply to the input weight parameters of this layer - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `T`"
  ([^BaseRecurrentLayer$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainInputWeights constraints))))

(defn weight-init-recurrent
  "Set the weight initialization for the recurrent weights. Not that if this is not set explicitly, the same
  weight initialization as the layer input weights is also used for the recurrent weights.

  weight-init - Weight initialization for the recurrent weights only. - `org.deeplearning4j.nn.weights.WeightInit`

  returns: `T`"
  ([^BaseRecurrentLayer$Builder this ^org.deeplearning4j.nn.weights.WeightInit weight-init]
    (-> this (.weightInitRecurrent weight-init))))

