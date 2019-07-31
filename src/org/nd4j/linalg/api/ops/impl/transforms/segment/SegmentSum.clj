(ns org.nd4j.linalg.api.ops.impl.transforms.segment.SegmentSum
  "Segment sum operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.segment SegmentSum]))

(defn ->segment-sum
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  data - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - `org.nd4j.autodiff.samediff.SDVariable`"
  (^SegmentSum [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (new SegmentSum same-diff data segment-ids))
  (^SegmentSum []
    (new SegmentSum )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SegmentSum this]
    (-> this (.opName))))

