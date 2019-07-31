(ns org.deeplearning4j.models.sequencevectors.graph.walkers.impl.NearestVertexWalker$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.walkers.impl NearestVertexWalker$Builder]))

(defn ->builder
  "Constructor.

  graph - `org.deeplearning4j.models.sequencevectors.graph.primitives.IGraph`"
  (^NearestVertexWalker$Builder [^org.deeplearning4j.models.sequencevectors.graph.primitives.IGraph graph]
    (new NearestVertexWalker$Builder graph)))

(defn set-seed
  "seed - `long`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.NearestVertexWalker$Builder`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.NearestVertexWalker$Builder [^NearestVertexWalker$Builder this ^Long seed]
    (-> this (.setSeed seed))))

(defn set-walk-length
  "This method defines maximal number of nodes to be visited during walk.
  PLEASE NOTE: If set to 0 - no limits will be used.
  Default value: 0

  length - `int`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.NearestVertexWalker$Builder`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.NearestVertexWalker$Builder [^NearestVertexWalker$Builder this ^Integer length]
    (-> this (.setWalkLength length))))

(defn set-depth
  "This method specifies, how deep walker goes from starting point
  Default value: 1

  depth - `int`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.NearestVertexWalker$Builder`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.NearestVertexWalker$Builder [^NearestVertexWalker$Builder this ^Integer depth]
    (-> this (.setDepth depth))))

(defn set-sampling-mode
  "This method defines sorting which will be used to generate walks.
  PLEASE NOTE: This option has effect only if walkLength is limited (>0).

  mode - `org.deeplearning4j.models.sequencevectors.graph.enums.SamplingMode`

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.NearestVertexWalker$Builder`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.NearestVertexWalker$Builder [^NearestVertexWalker$Builder this ^org.deeplearning4j.models.sequencevectors.graph.enums.SamplingMode mode]
    (-> this (.setSamplingMode mode))))

(defn build
  "This method returns you new GraphWalker instance

  returns: `org.deeplearning4j.models.sequencevectors.graph.walkers.impl.NearestVertexWalker<V>`"
  (^org.deeplearning4j.models.sequencevectors.graph.walkers.impl.NearestVertexWalker [^NearestVertexWalker$Builder this]
    (-> this (.build))))

