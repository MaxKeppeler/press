package me.saket.press.shared

import com.badoo.reaktive.scheduler.Scheduler
import com.badoo.reaktive.scheduler.trampolineScheduler
import com.badoo.reaktive.test.scheduler.TestScheduler
import me.saket.press.shared.rx.Schedulers

@Suppress("TestFunctionName")
fun FakeSchedulers(io: Scheduler = trampolineScheduler, computation: Scheduler = trampolineScheduler) =
  Schedulers(io, computation)
