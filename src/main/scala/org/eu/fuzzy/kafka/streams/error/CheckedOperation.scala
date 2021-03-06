package org.eu.fuzzy.kafka.streams.error

/**
 * Represents an identity of operation that's protected by a stream error handler.
 *
 * @param name  a name of stream operation
 */
sealed abstract class CheckedOperation(val name: String)

object CheckedOperation {
  case object DeserializeOperation extends CheckedOperation("deserialize")

  case object FilterOperation extends CheckedOperation("filter")
  case object MapOperation extends CheckedOperation("map")
  case object MapValuesOperation extends CheckedOperation("mapValues")
  case object FlatMapOperation extends CheckedOperation("flatMap")
  case object FlatMapValuesOperation extends CheckedOperation("flatMapValues")
  case object BranchOperation extends CheckedOperation("branch")
  case object ForeachOperation extends CheckedOperation("foreach")
  case object PeekOperation extends CheckedOperation("peek")

  case object InitializerOperation extends CheckedOperation("aggregate")
  case object MergeOperation extends CheckedOperation("aggregate")
  case object AggregateOperation extends CheckedOperation("aggregate")
  case object ReduceOperation extends CheckedOperation("reduce")

  case object LeftJoinOperation extends CheckedOperation("leftJoin")
  case object OuterJoinOperation extends CheckedOperation("outerJoin")
  case object InnerJoinOperation extends CheckedOperation("innerJoin")
  case object JoinByKeyOperation extends CheckedOperation("*Join")
}
