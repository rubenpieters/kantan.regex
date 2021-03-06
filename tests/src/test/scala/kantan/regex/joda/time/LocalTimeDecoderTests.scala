/*
 * Copyright 2016 Nicolas Rinaudo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kantan.regex.joda.time

import arbitrary._
import kantan.regex.laws.discipline.{GroupDecoderTests, MatchDecoderTests}
import org.joda.time.LocalTime
import org.joda.time.format.DateTimeFormat
import org.scalatest.FunSuite
import org.scalatest.prop.GeneratorDrivenPropertyChecks
import org.typelevel.discipline.scalatest.Discipline

class LocalTimeDecoderTests extends FunSuite with GeneratorDrivenPropertyChecks with Discipline {
  implicit val formatter = DateTimeFormat.mediumTime()

  checkAll("GroupDecoder[LocalTime]", GroupDecoderTests[LocalTime].decoder[Int, Int])
  checkAll("MatchDecoder[LocalTime]", MatchDecoderTests[LocalTime].decoder[Int, Int])
}
