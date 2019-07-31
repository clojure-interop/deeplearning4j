(ns org.nd4j.linalg.api.ops.impl.transforms.segment.SegmentMax
  "Segment max operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.segment SegmentMax]))

(defn ->segment-max
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  data - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - `org.nd4j.autodiff.samediff.SDVariable`"
  (^SegmentMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (new SegmentMax same-diff data segment-ids))
  (^SegmentMax []
    (new SegmentMax )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SegmentMax this]
    (-> this (.opName))))

