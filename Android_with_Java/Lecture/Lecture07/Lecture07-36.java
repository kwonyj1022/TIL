/* 홈에서 특정 앱을 실행하는 이벤트 */
Intent intent = new Intent();
        
// 1. 실행될 패키지 액티비티를 명시적으로 지정
intent.setClassName("com.example.task",
        "com.example.task.ActivityA1");

// 2. 해당 태스크의 가장 탑 액티비티를 복귀하는 역할
intent.setAction(Intent.ACTION_MAIN);
intent.addCategory(Intent.CATEGORY_LAUNCHER);

// 3. 해당 패키지의 태스크에서 실행되고, 태스크 내에 정리해야 할 액티비티가 존재한다면 정리하는 역할
intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
intent.addFlags(Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);

startActivity(intent);