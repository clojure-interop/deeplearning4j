(ns org.deeplearning4j.models.sequencevectors.graph.walkers.impl.WeightedWalker$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.walkers.impl WeightedWalker$Builder]))

(defn ->builder
  "Constructor.

  source-graph - `org.deeplearning4j.models.sequencevectors.graph.primitives.IGraph`"
  (^WeightedWalker$Builder [^org.deeplearning4j.models.sequencevectors.graph.primitives.IGraph source-graph]
    (new WeightedWalker$Builder source-graph)))

(defn set-walk-length
  "This method specifies output sequence (walk) length

  walk-length - `int`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.WeightedWalker$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.WeightedWalker$Builder [^WeightedWalker$Builder this ^Integer walk-length]
    (-> this (.setWalkLength walk-length))))

(defn set-no-edge-handling
  "This method defines walker behavior when it gets to node which has no next nodes available
  Default value: RESTART_ON_DISCONNECTED

  handling - `org.deeplearning4j.models.sequencevectors.graph.enums.NoEdgeHandling`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.WeightedWalker$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.WeightedWalker$Builder [^WeightedWalker$Builder this ^org.deeplearning4j.models.sequencevectors.graph.enums.NoEdgeHandling handling]
    (-> this (.setNoEdgeHandling handling))))

(defn set-seed
  "This method specifies random seed.

  seed - `long`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.WeightedWalker$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.WeightedWalker$Builder [^WeightedWalker$Builder this ^Long seed]
    (-> this (.setSeed seed))))

(defn set-walk-direction
  "This method defines next hop selection within walk

  direction - `org.deeplearning4j.models.sequencevectors.graph.enums.WalkDirection`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.WeightedWalker$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.WeightedWalker$Builder [^WeightedWalker$Builder this ^org.deeplearning4j.models.sequencevectors.graph.enums.WalkDirection direction]
    (-> this (.setWalkDirection direction))))

(defn set-restart-probability
  "This method defines a chance for walk restart
  Good value would be somewhere between 0.03-0.07

  alpha - `double`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.RandomWalker$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.RandomWalker$Builder [^WeightedWalker$Builder this ^Double alpha]
    (-> this (.setRestartProbability alpha))))

(defn build
  "Description copied from class: RandomWalker.Builder

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.WeightedWalker<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.WeightedWalker [^WeightedWalker$Builder this]
    (-> this (.build))))

