(ns org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.walkers.impl PopularityWalker$Builder]))

(defn ->builder
  "Constructor.

  source-graph - `org.deeplearning4j.models.sequencevectors.graph.primitives.IGraph`"
  (^PopularityWalker$Builder [^org.deeplearning4j.models.sequencevectors.graph.primitives.IGraph source-graph]
    (new PopularityWalker$Builder source-graph)))

(defn set-restart-probability
  "This method defines a chance for walk restart
  Good value would be somewhere between 0.03-0.07

  alpha - `double`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder [^PopularityWalker$Builder this ^Double alpha]
    (-> this (.setRestartProbability alpha))))

(defn set-walk-length
  "This method specifies output sequence (walk) length

  walk-length - `int`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder [^PopularityWalker$Builder this ^Integer walk-length]
    (-> this (.setWalkLength walk-length))))

(defn set-seed
  "This method specifies random seed.

  seed - `long`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder [^PopularityWalker$Builder this ^Long seed]
    (-> this (.setSeed seed))))

(defn set-popularity-mode
  "This method defines which nodes should be taken in account when choosing next hope: maximum popularity, lowest popularity, or average popularity.
  Default value: MAXIMUM

  popularity-mode - `org.deeplearning4j.models.sequencevectors.graph.enums.PopularityMode`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder [^PopularityWalker$Builder this ^org.deeplearning4j.models.sequencevectors.graph.enums.PopularityMode popularity-mode]
    (-> this (.setPopularityMode popularity-mode))))

(defn build
  "This method builds PopularityWalker object with previously specified params

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker [^PopularityWalker$Builder this]
    (-> this (.build))))

(defn set-no-edge-handling
  "This method defines walker behavior when it gets to node which has no next nodes available
  Default value: RESTART_ON_DISCONNECTED

  handling - `org.deeplearning4j.models.sequencevectors.graph.enums.NoEdgeHandling`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder [^PopularityWalker$Builder this ^org.deeplearning4j.models.sequencevectors.graph.enums.NoEdgeHandling handling]
    (-> this (.setNoEdgeHandling handling))))

(defn set-popularity-spread
  "This method defines, how much nodes should take place in next hop selection. Something like top-N nodes, or bottom-N nodes.
  Default value: 10

  top-n - `int`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder [^PopularityWalker$Builder this ^Integer top-n]
    (-> this (.setPopularitySpread top-n))))

(defn set-walk-direction
  "This method defines next hop selection within walk

  direction - `org.deeplearning4j.models.sequencevectors.graph.enums.WalkDirection`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder [^PopularityWalker$Builder this ^org.deeplearning4j.models.sequencevectors.graph.enums.WalkDirection direction]
    (-> this (.setWalkDirection direction))))

(defn set-spread-spectrum
  "This method allows you to define, if nodes within popularity spread should have equal chances to be picked for next hop, or they should have chances proportional to their popularity.
  Default value: PLAIN

  spectrum - `org.deeplearning4j.models.sequencevectors.graph.enums.SpreadSpectrum`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker$Builder [^PopularityWalker$Builder this ^org.deeplearning4j.models.sequencevectors.graph.enums.SpreadSpectrum spectrum]
    (-> this (.setSpreadSpectrum spectrum))))

