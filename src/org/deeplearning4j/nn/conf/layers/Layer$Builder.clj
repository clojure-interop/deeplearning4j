(ns org.deeplearning4j.nn.conf.layers.Layer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Layer$Builder]))

(defn ->builder
  "Constructor."
  (^Layer$Builder []
    (new Layer$Builder )))

(defn name
  "Layer name assigns layer string name.
  Allows easier differentiation between layers.

  layer-name - `java.lang.String`

  returns: `T`"
  ([^Layer$Builder this ^java.lang.String layer-name]
    (-> this (.name layer-name))))

(defn drop-out
  "Dropout probability. This is the probability of retaining each input activation value for a layer.
  dropOut(x) will keep an input activation with probability x, and set to 0 with probability 1-x.
  dropOut(0.0) is a special value / special case - when set to 0.0., dropout is disabled (not applied). Note
  that a dropout value of 1.0 is functionally equivalent to no dropout: i.e., 100% probability of retaining
  each input activation.
  When useDropConnect(boolean) is set to true (false by default), this method sets the drop connect
  probability instead.

  Note 1: Dropout is applied at training time only - and is automatically not applied at test time
  (for evaluation, etc)
  Note 2: This sets the probability per-layer. Care should be taken when setting lower values for
  complex networks (too much information may be lost with aggressive (very low) dropout values).
  Note 3: Frequently, dropout is not applied to (or, has higher retain probability for) input (first layer)
  layers. Dropout is also often not applied to output layers. This needs to be handled MANUALLY by the user
  - set .dropout(0) on those layers when using global dropout setting.
  Note 4: Implementation detail (most users can ignore): DL4J uses inverted dropout, as described here:
  http://cs231n.github.io/neural-networks-2/

  input-retain-probability - Dropout probability (probability of retaining each input activation value for a layer) - `double`

  returns: `T`"
  ([^Layer$Builder this ^Double input-retain-probability]
    (-> this (.dropOut input-retain-probability))))

(defn constrain-all-parameters
  "Set constraints to be applied to this layer. Default: no constraints.
  Constraints can be used to enforce certain conditions (non-negativity of parameters, max-norm regularization,
  etc). These constraints are applied at each iteration, after the parameters have been updated.

  constraints - Constraints to apply to all parameters of this layer - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `T`"
  ([^Layer$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainAllParameters constraints))))

(defn constrain-bias
  "Set constraints to be applied to bias parameters of this layer. Default: no constraints.
  Constraints can be used to enforce certain conditions (non-negativity of parameters, max-norm regularization,
  etc). These constraints are applied at each iteration, after the parameters have been updated.

  constraints - Constraints to apply to all bias parameters of this layer - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `T`"
  ([^Layer$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainBias constraints))))

(defn constrain-weights
  "Set constraints to be applied to the weight parameters of this layer. Default: no constraints.
  Constraints can be used to enforce certain conditions (non-negativity of parameters, max-norm regularization,
  etc). These constraints are applied at each iteration, after the parameters have been updated.

  constraints - Constraints to apply to all weight parameters of this layer - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `T`"
  ([^Layer$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainWeights constraints))))

(defn build
  "returns: `<E extends org.deeplearning4j.nn.conf.layers.Layer> E`"
  ([^Layer$Builder this]
    (-> this (.build))))

