package ru.stv.socialhelper;


import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // основные переменные
    private AdView mAdView;
    final int MAX_STREAMS = 1;

    //Звуковые переменные саундпула
    SoundPool hellosp;
    SoundPool dasp1;
    SoundPool sorrysp2;
    SoundPool prezikisp3;
    SoundPool netsp4;
    SoundPool posledniysp5;
    SoundPool bezsdachasp6;
    SoundPool goodeveningsp61;
    SoundPool gooddaysp62;
    SoundPool pokasp7;
    SoundPool spasibosp8;
    SoundPool timesp9;
    SoundPool nujensp10;
    SoundPool nenuensp11;
    SoundPool absosp;
    SoundPool abohsp;
    SoundPool abojsp;
    SoundPool othermore;
    //Мартовское Обновление
    SoundPool SPLove0316;
    SoundPool SPLisn0316;
    SoundPool SPJob0316;
    //SoundPool SPHome0316;
    SoundPool SPChe0316;
    SoundPool SPCheee0316;
    SoundPool SPSlish0316;

    //звуковые константы
    int streamIDPrevet;
    int streamIDJa;
    int streamIDSorry;
    int streamIDPreziki;
    int streamIDNo;
    int streamIDPosledniy;
    int streamIDBezSdacha;
    int streamIDGoodDay;
    int streamIDGoodEvening;
    int streamIDPokaGoodbay;
    int streamIDSps;
    int streamIDTime;
    int streamIDNujen;
    int streamIDNenuen;
    int streamIDSledOstan;
    int streamIDOknoDuet;
    int streamIDOknojarko;
    int StreamIDMore;
    //Мартовское Обновление
    int streamIDLove0316;
    int streamIDLisn0316;
    int streamIDJob0316;
    //int streamIDHome0316;
    int streamIDChe0316;
    int streamIDCheee0316;
    int streamIDSlish0316;

    // раздел текстбоксов
    TextView textview1;
    TextView textview2;
    TextView textview3;
    TextView textview4;

    // раздел кнопок. Релизные
    Button avtbt;
    Button mgzbt;
    Button prevet;
    Button ja;
    Button sorry;
    Button prezki;
    Button net;
    Button posledniy;
    Button bezsdacha;
    Button gd;
    Button sps;
    Button ge;
    Button ggvp;
    Button zavtra;
    Button nujen;
    Button neuje;
    Button cold;
    Button warm;
    Button sledostanov;
    Button more;
    // Раздел кнопок. Мартовское Обновление
    Button lav0316;
    Button lisn0316;
    Button job0316;
    //Button home0316;
    Button che0316;
    Button cheee0316;
    Button slish0316;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        // Раздел загрузки звуков
        hellosp = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        hellosp.load(this, R.raw.hello, 1);

        dasp1 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        dasp1.load(this, R.raw.ja, 1);

        sorrysp2 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        sorrysp2.load(this, R.raw.sorry, 1);

        prezikisp3 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        prezikisp3.load(this, R.raw.preziki,1);

        netsp4 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        netsp4.load(this, R.raw.no, 1);

        posledniysp5 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        posledniysp5.load(this, R.raw.posledniy, 1);

        bezsdachasp6 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        bezsdachasp6.load(this, R.raw.bezsdacha, 1);

        goodeveningsp61 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        goodeveningsp61.load(this, R.raw.goodevening, 1);

        gooddaysp62 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        gooddaysp62.load(this, R.raw.goodday, 1);

        pokasp7 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        pokasp7.load(this, R.raw.goodbay, 1);

        spasibosp8 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        spasibosp8.load(this, R.raw.sps, 1);

        timesp9 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        timesp9.load(this, R.raw.time, 1);

        nujensp10 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        nujensp10.load(this, R.raw.care, 1);

        nenuensp11 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        nenuensp11.load(this, R.raw.nocare, 1);

        absosp = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        absosp.load(this, R.raw.sledushiyaostanovka, 1);

        abohsp = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        abohsp.load(this, R.raw.cold, 1);

        abojsp = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        abojsp.load(this, R.raw.warm, 1);

        othermore = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        othermore.load(this, R.raw.more, 1);
        // Мартовская Обнова
        SPLove0316 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        SPLove0316.load(this, R.raw.iloveyou0316, 1);

        SPLisn0316 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        SPLisn0316.load(this, R.raw.listen0316, 1);

        SPJob0316 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        SPJob0316.load(this, R.raw.job0316, 1);

      /*  SPHome0316 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        SPHome0316.load(this, R.raw.gonehome0316, 1); */

        SPChe0316 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        SPChe0316.load(this, R.raw.che0316, 1);

        SPCheee0316 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        SPCheee0316.load(this, R.raw.cheee0316, 1);

        SPSlish0316 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        SPSlish0316.load(this, R.raw.sliiiish0316, 1);

        // Раздел присвоения основных значений вывода звука
        AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        final float curVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        final float maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        final float leftVolume = curVolume / maxVolume;
        final float rightVolume = curVolume / maxVolume;
        final int priority = 1;
        final int no_loop = 0;
        final float normal_playback_rate = 1f;

        // Раздел ассимиляции экранных кнопок с кодом
        textview1 = (TextView) findViewById(R.id.textView);
        textview2 = (TextView) findViewById(R.id.textView2);
        textview3 = (TextView) findViewById(R.id.textView3);
        textview4 = (TextView) findViewById(R.id.textView4);
        avtbt = (Button) findViewById(R.id.avtobusbt);
        mgzbt = (Button) findViewById(R.id.magazbt);
        prevet = (Button) findViewById(R.id.kassaprevet);
        ja = (Button) findViewById(R.id.allja);
        sorry = (Button) findViewById(R.id.allsorry);
        prezki = (Button) findViewById(R.id.kassapreziki);
        net = (Button) findViewById(R.id.allnein);
        sps = (Button) findViewById(R.id.kassasps);
        posledniy = (Button) findViewById(R.id.allposledniy);
        bezsdacha = (Button) findViewById(R.id.kassabezsdacha);
        gd = (Button) findViewById(R.id.allgoodday);
        ge = (Button) findViewById(R.id.allgoodevening);
        ggvp = (Button) findViewById(R.id.kassapoka);
        zavtra = (Button) findViewById(R.id.allzavtra);
        nujen = (Button) findViewById(R.id.kassanujen);
        neuje = (Button) findViewById(R.id.kassanenujen);
        cold = (Button) findViewById(R.id.coldbt);
        warm = (Button) findViewById(R.id.warmbt);
        sledostanov = (Button) findViewById(R.id.sledostanbt);
        more = (Button) findViewById(R.id.allmorebt);
        // Мартовское Обновление
        lav0316 = (Button) findViewById(R.id.Martlove);
        lisn0316 = (Button) findViewById(R.id.Martlisn);
        job0316 = (Button) findViewById(R.id.Martjob);
      //  home0316 = (Button) findViewById(R.id.MartHome);
        che0316 = (Button) findViewById(R.id.MartChe);
        cheee0316 = (Button) findViewById(R.id.MartCheee);
        slish0316 = (Button) findViewById(R.id.MartSlish);


        // Работа с кнопками
        View.OnClickListener perekluchen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.avtobusbt:
                        // кнопка транспорт, переключение инвиза автобуса
                        prevet.setVisibility(View.GONE);
                        ja.setVisibility(View.GONE);
                        sorry.setVisibility(View.GONE);
                        prezki.setVisibility(View.GONE);
                        net.setVisibility(View.GONE);
                        sps.setVisibility(View.GONE);
                        posledniy.setVisibility(View.GONE);
                        bezsdacha.setVisibility(View.GONE);
                        gd.setVisibility(View.GONE);
                        ge.setVisibility(View.GONE);
                        ggvp.setVisibility(View.GONE);
                        zavtra.setVisibility(View.GONE);
                        nujen.setVisibility(View.GONE);
                        neuje.setVisibility(View.GONE);
                        more.setVisibility(View.GONE);
                        cold.setVisibility(View.VISIBLE);
                        warm.setVisibility(View.VISIBLE);
                        sledostanov.setVisibility(View.VISIBLE);
                        textview1.setVisibility(View.GONE);
                        textview2.setVisibility(View.GONE);
                        textview3.setVisibility(View.GONE);
                        textview4.setVisibility(View.VISIBLE);
                        // Мартовская Обнова
                        lav0316.setVisibility(View.GONE);
                        lisn0316.setVisibility(View.GONE);
                       // home0316.setVisibility(View.GONE);
                        job0316.setVisibility(View.GONE);
                        che0316.setVisibility(View.GONE);
                        cheee0316.setVisibility(View.GONE);
                        slish0316.setVisibility(View.GONE);
                        break;
                    case R.id.magazbt:
                        // кнопка общее, тоже самое но с общими
                        prevet.setVisibility(View.VISIBLE);
                        ja.setVisibility(View.VISIBLE);
                        sorry.setVisibility(View.VISIBLE);
                        prezki.setVisibility(View.VISIBLE);
                        net.setVisibility(View.VISIBLE);
                        sps.setVisibility(View.VISIBLE);
                        posledniy.setVisibility(View.VISIBLE);
                        bezsdacha.setVisibility(View.VISIBLE);
                        gd.setVisibility(View.VISIBLE);
                        ge.setVisibility(View.VISIBLE);
                        ggvp.setVisibility(View.VISIBLE);
                        zavtra.setVisibility(View.VISIBLE);
                        nujen.setVisibility(View.VISIBLE);
                        neuje.setVisibility(View.VISIBLE);
                        cold.setVisibility(View.GONE);
                        warm.setVisibility(View.GONE);
                        sledostanov.setVisibility(View.GONE);
                        more.setVisibility(View.VISIBLE);
                        textview1.setVisibility(View.VISIBLE);
                        textview2.setVisibility(View.VISIBLE);
                        textview3.setVisibility(View.VISIBLE);
                        textview4.setVisibility(View.GONE);
                        // Мартовская Обнова
                        lav0316.setVisibility(View.VISIBLE);
                        lisn0316.setVisibility(View.VISIBLE);
                        //home0316.setVisibility(View.VISIBLE);
                        job0316.setVisibility(View.VISIBLE);
                        che0316.setVisibility(View.VISIBLE);
                        cheee0316.setVisibility(View.VISIBLE);
                        slish0316.setVisibility(View.VISIBLE);
                        break;
                    case R.id.kassaprevet:
                        //воспроизводит голос
                        streamIDPrevet = hellosp.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.allja:
                        //воспроизводит голос
                        streamIDJa = dasp1.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.allsorry:
                        //воспроизводит голос
                        streamIDSorry = sorrysp2.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.kassapreziki:
                        //воспроизводит голос
                        streamIDPreziki = prezikisp3.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.allnein:
                        //воспроизводит голос
                        streamIDNo = netsp4.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.allposledniy:
                        //воспроизводит голос
                        streamIDPosledniy = posledniysp5.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.kassabezsdacha:
                        //воспроизводит голос
                        streamIDBezSdacha = bezsdachasp6.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.allgoodday:
                        //воспроизводит голос
                        streamIDGoodDay = gooddaysp62.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.kassasps:
                        //воспроизводит голос
                        streamIDSps = spasibosp8.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.allzavtra:
                        //воспроизводит голос
                        streamIDTime = timesp9.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.kassanujen:
                        //воспроизводит голос
                        streamIDNujen = nujensp10.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.kassanenujen:
                        //воспроизводит голос
                        streamIDNenuen = nenuensp11.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.coldbt:
                        streamIDOknoDuet = abohsp.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.warmbt:
                        streamIDOknojarko = abojsp.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.sledostanbt:
                        streamIDSledOstan = absosp.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.allmorebt:
                        StreamIDMore = othermore.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.kassapoka:
                        streamIDPokaGoodbay = pokasp7.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.allgoodevening:
                        streamIDGoodEvening = goodeveningsp61.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    //Мартовское Обновление
                    case R.id.Martlove:
                        streamIDLove0316 = SPLove0316.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.Martlisn:
                        streamIDLisn0316 = SPLisn0316.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.Martjob:
                        streamIDJob0316 = SPJob0316.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.MartChe:
                        streamIDChe0316 = SPChe0316.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.MartCheee:
                        streamIDCheee0316 = SPCheee0316.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                    case R.id.MartSlish:
                        streamIDSlish0316 = SPSlish0316.play(MAX_STREAMS, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
                        break;
                }
            }
        };

        // Присвоение обработчика кнопкам
        avtbt.setOnClickListener(perekluchen);
        mgzbt.setOnClickListener(perekluchen);
        prevet.setOnClickListener(perekluchen);
        ja.setOnClickListener(perekluchen);
        sorry.setOnClickListener(perekluchen);
        prezki.setOnClickListener(perekluchen);
        net.setOnClickListener(perekluchen);
        posledniy.setOnClickListener(perekluchen);
        bezsdacha.setOnClickListener(perekluchen);
        gd.setOnClickListener(perekluchen);
        sps.setOnClickListener(perekluchen);
        ge.setOnClickListener(perekluchen);
        ggvp.setOnClickListener(perekluchen);
        zavtra.setOnClickListener(perekluchen);
        nujen.setOnClickListener(perekluchen);
        neuje.setOnClickListener(perekluchen);
        warm.setOnClickListener(perekluchen);
        cold.setOnClickListener(perekluchen);
        sledostanov.setOnClickListener(perekluchen);
        more.setOnClickListener(perekluchen);
        //Мартовское Обновление
        lav0316.setOnClickListener(perekluchen);
        lisn0316.setOnClickListener(perekluchen);
        job0316.setOnClickListener(perekluchen);
        che0316.setOnClickListener(perekluchen);
        cheee0316.setOnClickListener(perekluchen);
        slish0316.setOnClickListener(perekluchen);
    }
    // Оценка
    public void onClickRateThisApp(View v) {
        // Build the intent
        Uri market = Uri.parse("market://details?id=ru.stv.socialhelper");
        Intent rateIntent = new Intent(Intent.ACTION_VIEW, market);

// Verify it resolves
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(rateIntent, 0);
        boolean isIntentSafe = activities.size() > 0;

// Start an activity if it's safe
        if (isIntentSafe) {
            startActivity(rateIntent);
        }
    }
// Реклама
    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }


    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }


    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }
}
